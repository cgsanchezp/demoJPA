package com.ejemplo.demojpa.repositorio;

import org.springframework.data.repository.CrudRepository;
import com.ejemplo.demojpa.entidades.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends CrudRepository < Persona, String > {

}
