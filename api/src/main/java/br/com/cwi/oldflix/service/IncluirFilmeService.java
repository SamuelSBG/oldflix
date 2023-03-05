package br.com.cwi.oldflix.service;

import br.com.cwi.oldflix.controller.request.IncluirFilmeRequest;
import br.com.cwi.oldflix.controller.response.IncluirFilmeResponse;
import br.com.cwi.oldflix.domain.Filme;
import br.com.cwi.oldflix.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static br.com.cwi.oldflix.mapper.IncluirFilmeMapper.toEntity;
import static br.com.cwi.oldflix.mapper.IncluirFilmeMapper.toResponse;

@Service
public class IncluirFilmeService {

  @Autowired
  private FilmeRepository filmeRepository;

  public IncluirFilmeResponse incluir(IncluirFilmeRequest request) {

    Filme filme = toEntity(request);
    filme.setDisponivel(true);
    filmeRepository.save(filme);
    return toResponse(filme);
  }
}
