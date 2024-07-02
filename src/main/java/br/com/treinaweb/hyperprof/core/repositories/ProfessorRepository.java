package br.com.treinaweb.hyperprof.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinaweb.hyperprof.core.models.Professor;
import java.util.List;


public interface ProfessorRepository extends JpaRepository<Professor, Long> {

    List<Professor> findByDescricaoContaining(String descricao);
}
