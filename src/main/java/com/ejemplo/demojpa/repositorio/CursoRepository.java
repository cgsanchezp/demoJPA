package com.ejemplo.demojpa.repositorio;

import com.ejemplo.demojpa.entidades.Curso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends CrudRepository<Curso, String > {
}
