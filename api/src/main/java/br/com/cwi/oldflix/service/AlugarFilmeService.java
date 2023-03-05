package br.com.cwi.oldflix.service;

import br.com.cwi.oldflix.controller.request.AlugarFilmeRequest;
import br.com.cwi.oldflix.controller.response.AlugarFilmeResponse;
import br.com.cwi.oldflix.domain.Filme;
import br.com.cwi.oldflix.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static br.com.cwi.oldflix.mapper.AlugarFilmeMapper.toResponse;
import static java.time.LocalDate.now;

@Service
public class AlugarFilmeService {

  @Autowired
  private FilmeRepository filmeRepository;

  @Autowired
  private ValidarFilmeDisponivelService validarFilmeDisponivelService;

  @Autowired
  private RetornarFilmeCasoExistaService retornarFilmeCasoExistaService;

  public AlugarFilmeResponse alugar(Long id, AlugarFilmeRequest request) {

    Filme filme = retornarFilmeCasoExistaService.validar(id);

    validarFilmeDisponivelService.validar(filme.isDisponivel(), "Filme já está alugado.");

    filme.setResponsavel(request.getResponsavel());
    filme.setDisponivel(false);
    filme.setDataRetirada(now());

    filmeRepository.save(filme);

    return toResponse(filme);
  }
}
