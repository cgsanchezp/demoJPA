package com.ejemplo.demojpa.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Curso {
    @Id
    @Column(name="ID")
    private Long id;
    private String nombre;

    @Column(name="numeroCreditos")
    private int numerocreditos;

    public Curso() {
        super();
    }

    public Curso(String nombre, int numerocreditos) {
        super();
        this.nombre = nombre;
        this.numerocreditos = numerocreditos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumerocreditos() {
        return numerocreditos;
    }

    public void setNumerocreditos(int numerocreditos) {
        this.numerocreditos = numerocreditos;
    }
}
