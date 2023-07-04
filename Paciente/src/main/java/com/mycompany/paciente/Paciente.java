/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.paciente;

/**
 *
 * @author temporario
 */
import java.time.LocalDate;

class Paciente {
    private int codigo;
    private String nome;
    private LocalDate dataNascimento;
    
    public Paciente(int codigo, String nome, LocalDate dataNascimento) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public String getNome() {
        return nome;
    }
    
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
}

class Consulta {
    private LocalDate data;
    private Paciente paciente;
    
    public Consulta(LocalDate data, Paciente paciente) {
        this.data = data;
        this.paciente = paciente;
    }
    
    public LocalDate getData() {
        return data;
    }
    
    public Paciente getPaciente() {
        return paciente;
    }
}

