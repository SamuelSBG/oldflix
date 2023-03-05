package br.com.cwi.oldflix.service;

import br.com.cwi.oldflix.controller.response.DetalharFilmeResponse;
import br.com.cwi.oldflix.domain.Filme;
import br.com.cwi.oldflix.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static br.com.cwi.oldflix.mapper.DetalharFilmeMapper.toResponse;

@Service
public class DetalharFilmeService {

  @Autowired
  private FilmeRepository filmeRepository;

  @Autowired
  private RetornarFilmeCasoExistaService retornarFilmeCasoExistaService;

  public DetalharFilmeResponse detalhar(Long id) {
    Filme filme = retornarFilmeCasoExistaService.validar(id);
    return toResponse(filme);
  }
}
