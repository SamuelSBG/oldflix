package br.com.cwi.oldflix.service;

import br.com.cwi.oldflix.domain.Filme;
import br.com.cwi.oldflix.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RemoverFilmeService {

  @Autowired
  private FilmeRepository filmeRepository;

  @Autowired
  private RetornarFilmeCasoExistaService retornarFilmeCasoExistaService;

  @Autowired
  private ValidarFilmeDisponivelService validarFilmeDisponivelService;

  public void remover(Long id) {
    Filme filme = retornarFilmeCasoExistaService.validar(id);
    validarFilmeDisponivelService.validar(filme.isDisponivel(), "Filme está indisponível no momento para remove-lo.");
    filmeRepository.deleteById(id);
  }
}
