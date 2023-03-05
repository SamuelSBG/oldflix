package br.com.cwi.oldflix.mapper;

import br.com.cwi.oldflix.controller.response.EditarFilmeResponse;
import br.com.cwi.oldflix.domain.Filme;

public class EditarFilmeMapper {

  public static EditarFilmeResponse toResponse(Filme entity) {
    EditarFilmeResponse response = new EditarFilmeResponse();
    response.setTitulo(entity.getTitulo());
    response.setDescricao(entity.getDescricao());
    response.setCategoria(entity.getCategoria());
    return response;
  }
}
