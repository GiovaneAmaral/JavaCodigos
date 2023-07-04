/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.paciente;

import java.time.LocalDate;

/**
 *
 * @author temporario
 */
public class Main {
      public static void main(String[] args) {
        LocalDate dataNascimento = LocalDate.of(2009, 7, 10);
        Paciente paciente = new Paciente(1, "Giovane", dataNascimento);
        
        LocalDate dataConsulta = LocalDate.now();
        Consulta consulta = new Consulta(dataConsulta, paciente);
        
        System.out.println("Informações do Paciente:");
        System.out.println("Código: " + paciente.getCodigo());
        System.out.println("Nome: " + paciente.getNome());
        System.out.println("Data de Nascimento: " + paciente.getDataNascimento());
        
        System.out.println("\nInformações da Consulta:");
        System.out.println("Data: " + consulta.getData());
        System.out.println("Paciente: " + consulta.getPaciente().getNome());
    }
}
