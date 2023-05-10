/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade_dowhile_01;

import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Atividade_DoWhile_01 {

    static Scanner input = new Scanner (System.in);
    
    public static void main(String[] args) {
// Variáveis

        int idade, futuro = 0;
        String nome;
        
// Entrada de dados

        System.out.println("Digite o seu nome: ");
        nome = input.nextLine();

        do {
            System.out.println("Digite a sua idade: ");
            idade = Integer.valueOf(input.nextLine());
        } while (idade > 100 || idade < 0);
      
// Processamento de dados        
        
        futuro = idade + 5;

// Saída de dados
        System.out.println(nome + " sua idade daqui 5 anos será: " + futuro);
    }
    
}
