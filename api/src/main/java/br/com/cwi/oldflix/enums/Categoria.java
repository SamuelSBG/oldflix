package br.com.cwi.oldflix.enums;

import lombok.Getter;

@Getter
public enum Categoria {
  BRONZE(5), PRATA(3), OURO(2);

  private final int prazoEntrega;

  Categoria(int prazoEntrega) {
    this.prazoEntrega = prazoEntrega;
  }
}
