/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista_04_exercicio_03;

import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Lista_04_Exercicio_03 {

    static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {
// Variáveis

        double num1, num2;
        
// Entrada de dados

        System.out.print("Digite o primeiro número real: ");
        num1 = Double.valueOf(input.nextLine());
        
        System.out.print("Digite o segundo número real: ");
        num2 = Double.valueOf(input.nextLine());
        
// Processamento de dados

        verificaNumeroMaior(num1,num2);
        
    }
    
    public static void verificaNumeroMaior(double num1, double num2) {
        if (num1 > num2) {
            System.out.println("O número " + num1 + " é maior.");
        } else {
            System.out.println("O número " + num2 + " é maior.");
        }
    }
    
}
