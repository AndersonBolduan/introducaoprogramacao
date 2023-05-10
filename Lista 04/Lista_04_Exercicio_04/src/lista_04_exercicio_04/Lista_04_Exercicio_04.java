/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista_04_exercicio_04;

import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Lista_04_Exercicio_04 {

    static Scanner input = new Scanner (System.in);
    
    public static void main(String[] args) {
// Variáveis

        double celsius, fahrenheit;
        
// Entrada de dados

        System.out.print("Digite a temperatura em Celsius: ");
        celsius = Double.valueOf(input.nextLine());
        
// Processamento de dados

        fahrenheit = calculoDaConversao (celsius);
        
// Saída de dados

        System.out.println("O valor da temperatura em Fahrenheit é de: " + fahrenheit);
    }
    
    
    public static double calculoDaConversao (double celsius) {
        double fahrenheit;
        
        return fahrenheit = celsius * 9/5 + 32;
    }
}
