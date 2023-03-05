import { createBrowserRouter } from 'react-router-dom';

import { FilmDetail, Home } from '../ui/screens';

export const router = createBrowserRouter([
	{
		path: '/',
		element: <Home />,
	},
	{
		path: '/filmes/:id',
		element: <FilmDetail />,
	},
]);
