/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio_complementar7;

import java.util.Scanner;
/**
 *
 * @author ander
 */
public class Exercicio_complementar7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float qtipo1, qtipo2, qtipo3, vtipo1, vtipo2, vtipo3, vtotal; 
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a quantidade de picolés do tipo 1: ");
        qtipo1 = Float.valueOf(input.nextLine());
        
        System.out.print("Digite a quantidade de picolé do tipo 2: ");
        qtipo2 = Float.valueOf(input.nextLine());
        
        System.out.print("Digite a quantidade de picolé do tipo 3: ");
        qtipo3 = Float.valueOf(input.nextLine());
        
        vtipo1 = (float) (qtipo1 * 1.5);
        
        vtipo2 = (float) (qtipo2 * 2);
        
        vtipo3 = (float) (qtipo3 * 0.75);
        
        vtotal = (float) (vtipo1 + vtipo2 + vtipo3);
        
        System.out.println("O valor dos picolés do tipo 1 é: " + vtipo1);
        System.out.println("O valor dos picolés do tipo 2 é: " + vtipo2);
        System.out.println("O valor dos picolés do tipo 3 é: " + vtipo3);
        System.out.println("O valor total da sua compra é: " + vtotal);
    }
    
}
