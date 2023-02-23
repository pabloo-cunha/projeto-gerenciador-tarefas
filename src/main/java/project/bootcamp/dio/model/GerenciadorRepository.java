package project.bootcamp.dio.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GerenciadorRepository extends CrudRepository<GerenciadorTarefas, Long> {

    GerenciadorTarefas findByTitulo(String titulo);
}