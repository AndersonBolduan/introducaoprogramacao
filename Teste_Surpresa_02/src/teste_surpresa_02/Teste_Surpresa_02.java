/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste_surpresa_02;

import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Teste_Surpresa_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Variáveis
        int n1, n2, menos;
        Scanner input = new Scanner(System.in);
        
// Entrada de dados   
        System.out.print("Digite o primeiro número: ");
        n1 = Integer.valueOf(input.nextLine());
        
        System.out.print("Digite o segundo número: ");
        n2 = Integer.valueOf(input.nextLine());
        
// Processamento de dados
        menos = n1 - n2;
        
        if (menos >= 0) {
            System.out.println("A diferença entre eles é de: " + menos);
        } else{
            menos = menos * (-1);
            System.out.println("A diferença entre eles é de: " + menos);
        }
    }
    
}
