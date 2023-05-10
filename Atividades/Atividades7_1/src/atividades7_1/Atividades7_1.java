/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividades7_1;

import java.util.Scanner;
/**
 *
 * @author ander
 */
public class Atividades7_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variáveis
        int num1, num2;
        Scanner input = new Scanner(System.in);
        //Entrada de dados
        System.out.print("Digite o primeiro número: ");
        num1 = Integer.valueOf(input.nextLine());
        
        System.out.print("Digite o segundo número: ");
        num2 = Integer.valueOf(input.nextLine());
        
        //Processamento de dados e saídas
        if (num1 > num2){
            System.out.println("O primeiro número é maior");
        } else if (num2 > num1) {
            System.out.println("O segundo número é maior");
        } else {
            System.out.println("Os números são iguais");
        }
    }
    
}
