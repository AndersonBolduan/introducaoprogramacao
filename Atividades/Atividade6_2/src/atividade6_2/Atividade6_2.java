/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade6_2;

import java.util.Scanner;
/**
 *
 * @author ander
 */
public class Atividade6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float num1, num2;
        Scanner input = new Scanner (System.in);
        
        System.out.print("Digite o número 1: ");
        num1 = Float.valueOf(input.nextLine());
        
        System.out.print("Digite o número 2: ");
        num2 = Float.valueOf(input.nextLine());
        
        if (num1 > num2) {
            System.out.println("O número maior é o: " + num1);
        } else {
            System.out.println("O número maior é o: " + num2);
        }
    }
    
}
