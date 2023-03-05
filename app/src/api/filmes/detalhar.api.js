import { instanceAxios } from '../_base/instanceAxios.api';

export async function detalhar({ id }) {
	const response = await instanceAxios.get(`/filmes/${id}`);

	return response.data;
}
