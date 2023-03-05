package br.com.cwi.oldflix.mapper;

import br.com.cwi.oldflix.controller.request.IncluirFilmeRequest;
import br.com.cwi.oldflix.controller.response.IncluirFilmeResponse;
import br.com.cwi.oldflix.domain.Filme;

public class IncluirFilmeMapper {

  public static Filme toEntity(IncluirFilmeRequest request) {
    Filme entity = new Filme();
    entity.setTitulo(request.getTitulo());
    entity.setDescricao(request.getDescricao());
    entity.setCategoria(request.getCategoria());
    entity.setImagem(request.getImagem());
    return entity;
  }
  
  public static IncluirFilmeResponse toResponse(Filme entity) {
    IncluirFilmeResponse response = new IncluirFilmeResponse();
    response.setId(entity.getId());
    return response;
  }

}
