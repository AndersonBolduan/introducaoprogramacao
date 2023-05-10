/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividades_03;

import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Atividades_03 {

    static Scanner input = new Scanner (System.in);
    
    public static void main(String[] args) {
// Variáveis

        int n, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        
        System.out.println("Digite a quantidade do conjunto de números: ");
        n = Integer.valueOf(input.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número: ");
            int numero = Integer.valueOf(input.nextLine());
            
            if (numero > maior) {
                maior = numero;
            }
            
            if (numero < menor) {
                menor = numero;
            }
        }
        MostraMaiorEMenor(maior, menor);
    }
    
    public static void MostraMaiorEMenor (int maior, int menor) {
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }
}
