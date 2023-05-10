/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividades_9_1;

import java.util.Scanner;
/**
 *
 * @author ander
 */
public class Atividades_9_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Vairáveis
        int idade;
        float peso;
        char genero;
        String nome;
        Scanner input = new Scanner (System.in);
        
// Entrada de dados
        System.out.print("Digite o nome: ");
        nome = input.nextLine();
        System.out.print("Digite a idade: ");
        idade = input.nextInt();
        System.out.print("Digite o peso: ");
        peso = input.nextFloat();
        System.out.print("Digite o gênero: ");
        genero = input.nextLine().charAt(0);
    }
    
}
