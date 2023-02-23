package project.bootcamp.dio.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.bootcamp.dio.model.GerenciadorTarefas;
import project.bootcamp.dio.service.GerenciadorService;

@RestController
@RequestMapping("/gerenciador")
@Api(value = "Gerenciador de Tarefas")
public class GerenciadorTarefasController {

    @Autowired
    GerenciadorService gerenciadorService;
    @GetMapping
    @ApiOperation(value = "Listar todas as tarefas")
    public ResponseEntity<Iterable<GerenciadorTarefas>> buscarTodos(){
        return ResponseEntity.ok(gerenciadorService.buscarTodos());
    }

    @GetMapping("/gerenciador/{id}")
    public ResponseEntity<GerenciadorTarefas> buscarId(@PathVariable Long id){
        return ResponseEntity.ok(gerenciadorService.buscarId(id));
    }

    @PostMapping
    public ResponseEntity<GerenciadorTarefas> criarTarefa(@RequestBody GerenciadorTarefas tarefas){
        gerenciadorService.criarTarefa(tarefas);
        return ResponseEntity.ok(tarefas);
    }


    @PutMapping("/gerenciador/{id}")
    public ResponseEntity<GerenciadorTarefas> atualizar(@PathVariable Long id, @RequestBody GerenciadorTarefas tarefas){
        gerenciadorService.atualizarTarefa(id, tarefas);
        return ResponseEntity.ok(tarefas);
    }

    @DeleteMapping("/gerenciador/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        gerenciadorService.deletarTarefa(id);
        return ResponseEntity.ok().build();
    }
}
