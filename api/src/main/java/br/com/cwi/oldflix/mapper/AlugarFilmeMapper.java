package br.com.cwi.oldflix.mapper;

import br.com.cwi.oldflix.controller.response.AlugarFilmeResponse;
import br.com.cwi.oldflix.domain.Filme;

public class AlugarFilmeMapper {

  public static AlugarFilmeResponse toResponse(Filme entity) {
    AlugarFilmeResponse response = new AlugarFilmeResponse();
    response.setResponsavel(entity.getResponsavel());
    response.setDisponivel(entity.isDisponivel());
    response.setDataRetirada(entity.getDataRetirada());
    return response;
  }
}
