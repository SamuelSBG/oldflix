import React from 'react';
import { Link } from 'react-router-dom';

import './filmCard.style.css';

export function FilmCard({ id, image, avaible }) {
	return (
		<Link to={`/filmes/${id}`}>
			<div className={`film-card ${!avaible && 'film-card-unvaible'}`}>
				<div className="film-card-image">
					<img src={image} alt="Imagem do filme" />
				</div>
			</div>
		</Link>
	);
}
