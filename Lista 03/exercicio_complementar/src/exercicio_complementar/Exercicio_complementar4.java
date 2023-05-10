/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio_complementar;

import java.util.Scanner;
/**
 *
 * @author ander
 */
public class Exercicio_complementar4 {

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
        
        soma = (a+b)*(a+b);
        
        System.out.println("O quadradado da soma dos valores A e B é: " + soma);
    }
    
}
