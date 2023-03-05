package br.com.cwi.oldflix.service;

import br.com.cwi.oldflix.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@Service
public class ValidarFilmeIndisponivelService {

  @Autowired
  private FilmeRepository filmeRepository;

  public void validar(boolean isDisponivel) {

    if (isDisponivel) {
      throw new ResponseStatusException(BAD_REQUEST, "Filme já está disponível para alugar.");
    }
  }
}
