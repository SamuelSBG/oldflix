package br.com.cwi.oldflix.service;

import br.com.cwi.oldflix.domain.Filme;
import br.com.cwi.oldflix.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@Service
public class RetornarFilmeCasoExistaService {

  @Autowired
  private FilmeRepository filmeRepository;

  public Filme validar(Long id) {
    return filmeRepository.findById(id)
            .orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Filme não encontrado."));
  }
}
