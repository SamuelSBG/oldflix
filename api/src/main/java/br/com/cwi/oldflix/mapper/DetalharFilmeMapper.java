package br.com.cwi.oldflix.mapper;

import br.com.cwi.oldflix.controller.response.DetalharFilmeResponse;
import br.com.cwi.oldflix.domain.Filme;

public class DetalharFilmeMapper {

  public static DetalharFilmeResponse toResponse(Filme entity) {
    DetalharFilmeResponse response = new DetalharFilmeResponse();
    response.setId(entity.getId());
    response.setTitulo(entity.getTitulo());
    response.setDescricao(entity.getDescricao());
    response.setCategoria(entity.getCategoria());
    response.setDisponivel(entity.isDisponivel());
    response.setResponsavel(entity.getResponsavel());
    response.setDataRetirada(entity.getDataRetirada());
    response.setImagem(entity.getImagem());

    if (!entity.isDisponivel()) {
      response.setDataEntrega();
      response.setSituacao();
    }

    return response;
  }
}
