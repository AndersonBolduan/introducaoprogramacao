/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividades_11_3;

import java.util.Scanner;
/**
 *
 * @author ander
 */
public class Atividades_11_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Variáveis
        int n1, n2, n3, d1, d2, d3;
        Scanner input = new Scanner (System.in);
        
        System.out.print("Digite o primeiro número: ");
        n1 = Integer.valueOf(input.nextLine());
        
        System.out.print("Digite o segundo número: ");
        n2 = Integer.valueOf(input.nextLine());
        
        System.out.print("Digite o terceiro número: ");
        n3 = Integer.valueOf(input.nextLine());
        
        d1 = dobro(n1);
        d2 = dobro(n2);
        d3 = dobro(n3);
        
        System.out.println("O dobro de " + n1 + " é: " + dobro(n1));
        System.out.println("O dobro de " + n2 + " é: " + dobro(n2));
        System.out.println("O dobro de " + n3 + " é: " + dobro(n3));
    }
    
    public static int dobro (int n) {
        n = n * 2;
        return n;
    }
    
}
