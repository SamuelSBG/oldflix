package br.com.cwi.oldflix.domain;

import br.com.cwi.oldflix.enums.Categoria;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

import static javax.persistence.EnumType.STRING;
import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@Entity
public class Filme {

  @Id
  @GeneratedValue(strategy = IDENTITY)
  private Long id;
  private String titulo;
  private String descricao;
  private boolean disponivel;

  @Enumerated(STRING)
  private Categoria categoria;
  private String responsavel;
  private LocalDate dataRetirada;
  private String imagem;
}
