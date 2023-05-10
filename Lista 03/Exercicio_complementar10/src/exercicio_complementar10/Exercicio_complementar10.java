/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio_complementar10;

import java.util.Scanner;
/**
 *
 * @author ander
 */
public class Exercicio_complementar10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, divisao, resto;
        Scanner input = new Scanner(System.in); 
        System.out.print("Digite o numero a ser dividido: ");
        numero = Integer.valueOf(input.nextLine());
        
        divisao = numero / 2;
        resto = numero % 2;
        
        System.out.println("A divisãodo número " + numero + " é: " + divisao);
        System.out.println("O resto da divisão do número " + numero + " por 2 é: " + resto);
        
    }
    
}
