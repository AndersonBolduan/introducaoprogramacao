/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista_04_exercicio_05;

import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Lista_04_Exercicio_05 {

    static Scanner input = new Scanner (System.in);
    
    public static void main(String[] args) {
// Variáveis

        int num;
        
// Entrada de dados

        System.out.print("Digite o número: ");
        num = Integer.valueOf(input.nextLine());
        
// Processamento de Dados

        verificaONumero(num);
    }
    
    
    public static void verificaONumero (int num) {
        if (num % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }
    }
}
