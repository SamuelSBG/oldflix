package br.com.cwi.oldflix.controller.response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class AlugarFilmeResponse {
  private boolean disponivel;
  private String responsavel;
  private LocalDate dataRetirada;
}
