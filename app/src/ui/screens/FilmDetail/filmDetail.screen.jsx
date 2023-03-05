import React, { useEffect, useState } from 'react';
import { useParams } from 'react-router-dom';
import { detalhar } from '../../../api/filmes/detalhar.api';
import { Container, Loading, MainTitle } from '../../components';

import './filmDetail.style.css';

export function FilmDetail() {
	const { id } = useParams();

	const [detail, setDetail] = useState({});
	const [isLoading, setIsLoading] = useState(true);

	useEffect(() => {
		async function getDetailFilm() {
			try {
				setIsLoading(true);
				const responseDetalhar = await detalhar({ id });
				setDetail(responseDetalhar);
			} catch (error) {
				console.log(error);
			} finally {
				setIsLoading(false);
			}
		}

		getDetailFilm();
	}, [id]);

	function renderDetailFilm() {
		if (isLoading) return <Loading />;

		return (
			<Container>
				<MainTitle>{detail.titulo}</MainTitle>

				<p className="avaible-film">
					{detail.disponivel ? 'Disponível' : 'Indisponível'}
				</p>
				<p className="film-category">{detail.categoria}</p>

				<div className="image-film-box">
					<img src={detail.imagem} alt="imagem filme" />
				</div>
				<p className="film-description">{detail.descricao}</p>
			</Container>
		);
	}

	return renderDetailFilm();
}
