package br.com.cwi.oldflix.controller.response;

import br.com.cwi.oldflix.enums.Categoria;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EditarFilmeResponse {
  private String titulo;
  private String descricao;
  private Categoria categoria;
}
