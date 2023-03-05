package br.com.cwi.oldflix.service;

import br.com.cwi.oldflix.controller.response.ListarFilmesResponse;
import br.com.cwi.oldflix.mapper.ListarFilmesMapper;
import br.com.cwi.oldflix.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.*;

@Service
public class ListarFilmesService {

  @Autowired
  private FilmeRepository filmeRepository;

  public List<ListarFilmesResponse> listar() {

    return filmeRepository.findAll()
            .stream()
            .map(ListarFilmesMapper::toResponse)
            .collect(toList());
  }
}
