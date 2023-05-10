/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio_complementar3;

import java.util.Scanner;
/**
 *
 * @author ander
 */
public class Exercicio_complementar3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, soma;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor A: ");
        a = Integer.valueOf(input.nextLine());
        
        System.out.print("Digite o valor B: ");
        b = Integer.valueOf(input.nextLine());
        
        soma = (a*a) + (b*b);
        
        System.out.println("A soma dos quadrados dos números A e B, são: " + soma);
    }
    
}
