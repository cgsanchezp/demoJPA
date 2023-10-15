package com.ejemplo.demojpa;

import com.ejemplo.demojpa.repositorio.CursoRepository;
import com.ejemplo.demojpa.repositorio.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
public class DemoJpaApplication implements CommandLineRunner {
    @Autowired
    PersonaRepository repositorio;
    @Autowired
    CursoRepository cursorepositorio;

    public static void main(String[] args) {
        SpringApplication.run(DemoJpaApplication.class, args);
    }

    @Override
    public void run(String...args) throws Exception {
        /*repositorio.findAll().forEach(
                (p) ->
                        System.out.println(p.getNombre() + " " + p.getApellidos())
        );*/

        //consultado todos los cursos
        cursorepositorio.findAll().forEach(
                (p) ->
                        System.out.println("Curso: "+ p.getNombre() + " |Numero de creditos:" + p.getNumerocreditos())
        );

    }
}
