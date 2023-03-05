package br.com.cwi.oldflix.mapper;

import br.com.cwi.oldflix.controller.response.ListarFilmesResponse;
import br.com.cwi.oldflix.domain.Filme;

public class ListarFilmesMapper {

  public static ListarFilmesResponse toResponse(Filme entity) {
    ListarFilmesResponse response = new ListarFilmesResponse();
    response.setId(entity.getId());
    response.setTitulo(entity.getTitulo());
    response.setDescricao(entity.getDescricao());
    response.setCategoria(entity.getCategoria());
    response.setDisponivel(entity.isDisponivel());
    response.setImagem(entity.getImagem());
    return response;
  }
}
