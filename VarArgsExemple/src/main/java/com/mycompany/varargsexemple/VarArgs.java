/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.varargsexemple;

/**
 *
 * @author temporario
 */
public class VarArgs {
    public static int findLargestNumber(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Nenhum número fornecido.");
        }

        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        int result = findLargestNumber(10, 5, 8, 20, 15);
        System.out.println("O maior número é: " + result);
    }
}
