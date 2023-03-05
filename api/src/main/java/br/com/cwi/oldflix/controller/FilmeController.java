package br.com.cwi.oldflix.controller;

import br.com.cwi.oldflix.controller.request.AlugarFilmeRequest;
import br.com.cwi.oldflix.controller.request.EditarFilmeRequest;
import br.com.cwi.oldflix.controller.request.IncluirFilmeRequest;
import br.com.cwi.oldflix.controller.response.*;
import br.com.cwi.oldflix.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

  @Autowired
  private ListarFilmesService listarFilmesService;

  @Autowired
  private IncluirFilmeService incluirFilmeService;

  @Autowired
  private AlugarFilmeService alugarFilmeService;

  @Autowired
  private DevolverFilmeService devolverFilmeService;

  @Autowired
  private RemoverFilmeService removerFilmeService;

  @Autowired
  private EditarFilmeService editarFilmeService;

  @Autowired
  private DetalharFilmeService detalharFilmeService;

  @GetMapping
  public List<ListarFilmesResponse> listar() {
    return listarFilmesService.listar();
  }

  @PostMapping
  public IncluirFilmeResponse incluir(@Valid @RequestBody IncluirFilmeRequest request) {
    return incluirFilmeService.incluir(request);
  }

  @PutMapping("/{id}/alugar")
  public AlugarFilmeResponse alugar(@PathVariable Long id, @Valid @RequestBody AlugarFilmeRequest request) {
    return alugarFilmeService.alugar(id, request);
  }

  @PutMapping("/{id}/devolver")
  public void devolver(@PathVariable Long id) {
    devolverFilmeService.devolver(id);
  }

  @DeleteMapping("/{id}")
  public void remover(@PathVariable Long id) {
    removerFilmeService.remover(id);
  }

  @PutMapping("/{id}")
  public EditarFilmeResponse editar(@PathVariable Long id, @Valid @RequestBody EditarFilmeRequest request) {
    return editarFilmeService.editar(id, request);
  }

  @GetMapping("/{id}")
  public DetalharFilmeResponse detalhar(@PathVariable Long id) {
    return detalharFilmeService.detalhar(id);
  }

}
