/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividades_9_2;

import java.util.Scanner;
/**
 *
 * @author ander
 */
public class Atividades_9_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Variáveis
        int a, b, c;
        double x1, x2, delta;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o valor de a: ");
        a = Integer.parseInt(input.nextLine());
        System.out.print("Digite o valor de b: ");
        b = Integer.parseInt(input.nextLine());
        System.out.print("Digite o valor de c: ");
        c = Integer.parseInt(input.nextLine());
 
// Processamento de dados
        
        delta = b * b -(4 * a * c);
        
        x1 = ((b * (-1)) + Math.sqrt(delta)) / (2 * a);
        
        x2 = ((b * (-1)) - Math.sqrt(delta)) / (2 * a);

// Saída de dados

        System.out.println("O valor de x1 é " + x1);
        System.out.println("O valor de x2 é " + x2);
    }
    
}
