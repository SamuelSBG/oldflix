import React, { useEffect, useState } from 'react';
import { listar } from '../../../api/filmes/listar.api';

import {
	CardContainer,
	Container,
	FilmCard,
	Loading,
	MainTitle,
} from '../../components';

export function Home() {
	const [listFilm, setListFilm] = useState([]);
	const [isLoading, setIsLoading] = useState(true);

	useEffect(() => {
		async function getFilmes() {
			try {
				setIsLoading(true);
				const filmesResponse = await listar();
				setListFilm(filmesResponse);
			} catch (error) {
				console.log(error);
			} finally {
				setIsLoading(false);
			}
		}

		getFilmes();
	}, []);

	function renderHome() {
		if (isLoading) return <Loading />;

		return (
			<Container>
				<MainTitle>OldFlix</MainTitle>
				<CardContainer>
					{listFilm.map((film) => (
						<FilmCard
							key={film.id}
							id={film.id}
							avaible={film.disponivel}
							image={film.imagem}
						/>
					))}
				</CardContainer>
			</Container>
		);
	}

	return renderHome();
}
