import { instanceAxios } from '../_base/instanceAxios.api';

export async function listar() {
	const response = await instanceAxios.get('/filmes');

	return response.data;
}
