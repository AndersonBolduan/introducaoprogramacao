/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista_3_exercicio_04;

import java.util.Scanner;
/**
 *
 * @author ander
 */
public class Lista_3_Exercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Variáveis
        int numero, par, impar;
        Scanner input = new Scanner(System.in);
        
// Entrada de Dados
        System.out.print("Digite um número inteiro: ");
        numero = Integer.valueOf(input.nextLine());
        
// Processamento de dados
        numero = numero % 2;
        
// Saída de dados
        if(numero == 0){
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }
    }
    
}
