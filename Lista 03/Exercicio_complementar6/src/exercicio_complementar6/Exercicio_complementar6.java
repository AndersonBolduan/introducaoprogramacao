/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio_complementar6;

import java.util.Scanner;
/**
 *
 * @author ander
 */
public class Exercicio_complementar6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float celsius, fahrenheit;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius que deseja converter para Fahrenheit: ");
        celsius = Float.valueOf(input.nextLine());
        
        fahrenheit = (float) celsius * 9/5 + 32;
        
        System.out.println(celsius + "em Celsius é igual a " + fahrenheit + " em Fahrenheit");
    }
    
}
