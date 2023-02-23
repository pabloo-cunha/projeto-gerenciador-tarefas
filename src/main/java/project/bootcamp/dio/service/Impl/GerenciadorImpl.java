package project.bootcamp.dio.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.bootcamp.dio.model.GerenciadorRepository;
import project.bootcamp.dio.model.GerenciadorTarefas;
import project.bootcamp.dio.service.GerenciadorService;

import java.util.Optional;

@Service
public class GerenciadorImpl implements GerenciadorService {

    @Autowired
    private GerenciadorRepository gerenciadorRepository;



    @Override
    public Iterable<GerenciadorTarefas> buscarTodos() {
        return gerenciadorRepository.findAll();
    }

    @Override
    public GerenciadorTarefas buscarId(Long id) {
        Optional<GerenciadorTarefas> tarefas = gerenciadorRepository.findById(id);
        return tarefas.orElseThrow(() -> new RuntimeException("Valor não presente"));
    }


    @Override
    public void criarTarefa(GerenciadorTarefas tarefas) {
        String titulo = tarefas.getTitulo();
        GerenciadorTarefas tarefaExistente = gerenciadorRepository.findByTitulo(titulo);
        if (tarefaExistente != null){
            throw new RuntimeException("Tarefa já existente");
        }else
            gerenciadorRepository.save(tarefas);

    }

    @Override
    public void atualizarTarefa(Long id, GerenciadorTarefas tarefas) {
        Optional<GerenciadorTarefas> tarefaBd = gerenciadorRepository.findById(id);
        if (tarefaBd.isPresent()){
            criarTarefa(tarefas);
        }
    }

    @Override
    public void deletarTarefa(Long id) {
        gerenciadorRepository.deleteById(id);
    }
}
