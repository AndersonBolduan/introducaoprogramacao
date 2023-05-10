/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista_3_exercicio_5;

import java.util.Scanner;
/**
 *
 * @author ander
 */
public class Lista_3_Exercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Variáveis
        int numero, f1, f2, f3;
        Scanner input = new Scanner(System.in);
        
// Entrada de Dados
        System.out.print("Digite um número inteiro: ");
        numero = Integer.valueOf(input.nextLine());
        
// Processamento e saída de dados
        
        if (numero <= 10){
            System.out.println("F1");
        } else if (numero <= 100) {
            System.out.println("F2");
        } else {
            System.out.println("F3");
        }
        
        
    }
    
}
