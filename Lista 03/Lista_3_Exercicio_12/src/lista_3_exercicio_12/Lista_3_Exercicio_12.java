/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista_3_exercicio_12;

import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Lista_3_Exercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Variáveis

        int angulo;
        
        Scanner input = new Scanner(System.in);
        
// Entrada de dados
        System.out.print("Digite o ângulo a ser analisado: ");
        angulo = Integer.valueOf(input.nextLine());
        
// Processamento de dados
        if (angulo < 90) 
            System.out.println("é um ângulo agudo");
        
        if (angulo == 90)
            System.out.println("é um ângulo reto");
        
        if (angulo > 90) 
            System.out.println("é um ângulo obtuso");
    }
    
}
