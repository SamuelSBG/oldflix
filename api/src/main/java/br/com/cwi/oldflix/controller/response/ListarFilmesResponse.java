package br.com.cwi.oldflix.controller.response;

import br.com.cwi.oldflix.enums.Categoria;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListarFilmesResponse {
  private Long id;
  private String titulo;
  private String descricao;
  private boolean disponivel;
  private Categoria categoria;
  private String imagem;
}
