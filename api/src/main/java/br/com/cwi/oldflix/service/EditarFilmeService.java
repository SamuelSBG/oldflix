package br.com.cwi.oldflix.service;

import br.com.cwi.oldflix.controller.request.EditarFilmeRequest;
import br.com.cwi.oldflix.controller.response.EditarFilmeResponse;
import br.com.cwi.oldflix.domain.Filme;
import br.com.cwi.oldflix.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static br.com.cwi.oldflix.mapper.EditarFilmeMapper.toResponse;

@Service
public class EditarFilmeService {

  @Autowired
  private FilmeRepository filmeRepository;

  @Autowired
  private RetornarFilmeCasoExistaService retornarFilmeCasoExistaService;

  @Autowired
  private ValidarFilmeDisponivelService validarFilmeDisponivelService;

  public EditarFilmeResponse editar(Long id, EditarFilmeRequest request) {
    Filme filme = retornarFilmeCasoExistaService.validar(id);

    validarFilmeDisponivelService
            .validar(filme.isDisponivel(), "Filme está indisponível no momento para edita-lo.");

    filme.setTitulo(request.getTitulo());
    filme.setDescricao(request.getDescricao());
    filme.setCategoria(request.getCategoria());

    filmeRepository.save(filme);

    return toResponse(filme);
  }
}
