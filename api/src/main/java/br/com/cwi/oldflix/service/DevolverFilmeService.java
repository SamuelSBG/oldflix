package br.com.cwi.oldflix.service;

import br.com.cwi.oldflix.domain.Filme;
import br.com.cwi.oldflix.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DevolverFilmeService {

  @Autowired
  private FilmeRepository filmeRepository;

  @Autowired
  private RetornarFilmeCasoExistaService retornarFilmeCasoExistaService;

  @Autowired
  private ValidarFilmeIndisponivelService validarFilmeIndisponivelService;

  public void devolver(Long id) {
    Filme filme = retornarFilmeCasoExistaService.validar(id);

    validarFilmeIndisponivelService.validar(filme.isDisponivel());

    filme.setDisponivel(true);
    filme.setDataRetirada(null);
    filme.setResponsavel(null);
    filmeRepository.save(filme);
  }
}
