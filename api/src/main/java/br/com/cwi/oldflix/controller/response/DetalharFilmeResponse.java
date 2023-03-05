package br.com.cwi.oldflix.controller.response;

import br.com.cwi.oldflix.enums.Categoria;
import br.com.cwi.oldflix.enums.Situacao;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

import static java.time.LocalDate.now;

@Getter
@Setter
public class DetalharFilmeResponse {
  private Long id;
  private String titulo;
  private String descricao;
  private boolean disponivel;
  private Categoria categoria;
  private String responsavel;
  private LocalDate dataRetirada;
  private String imagem;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private LocalDate dataEntrega;
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Situacao situacao;

  public void setDataEntrega() {
    this.dataEntrega = dataRetirada.plusDays(categoria.getPrazoEntrega());
  }

  public void setSituacao() {
    this.situacao = now().isAfter(dataEntrega) ? Situacao.EM_ATRASO :  Situacao.EM_DIA;
  }

}
