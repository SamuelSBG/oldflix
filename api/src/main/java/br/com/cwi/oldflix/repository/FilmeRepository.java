package br.com.cwi.oldflix.repository;

import br.com.cwi.oldflix.domain.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
}
