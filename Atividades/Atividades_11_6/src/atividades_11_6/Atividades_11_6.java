/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividades_11_6;

import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Atividades_11_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variáveis
        int a, b, c, d;
        Scanner input = new Scanner (System.in);
        
// Entrada de dados

        System.out.print("Digite o primeiro número: ");
        a = Integer.valueOf(input.nextLine());
        
        System.out.print("Diigte o segundo número: ");
        b = Integer.valueOf(input.nextLine());
        
// Processamento de dados

        if (a % 2 == 0 && b % 2 ==0){
            c = a + b;
        } else if (a % 2 != 0 && b % 2 != 0) {
            c = a - b;
        } else {
            c = a * b;
        }
        
        if (a % 2 == 0 && c % 2 ==0){
            d = a + c;
        } else if (a % 2 != 0 && c % 2 != 0) {
            d = a - c;
        } else {
            d = a * c;
        }
        
//Saída de dados
        System.out.println("Valor de C: " + c);
        System.out.println("Valor de D: " + d);
    }
    
}
