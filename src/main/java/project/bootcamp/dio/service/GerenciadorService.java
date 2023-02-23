package project.bootcamp.dio.service;

import project.bootcamp.dio.model.GerenciadorTarefas;

public interface GerenciadorService {
    Iterable<GerenciadorTarefas> buscarTodos();

    GerenciadorTarefas buscarId(Long id);

    void criarTarefa(GerenciadorTarefas tarefas);

    void atualizarTarefa(Long id, GerenciadorTarefas tarefas);

    void deletarTarefa(Long id);
}
