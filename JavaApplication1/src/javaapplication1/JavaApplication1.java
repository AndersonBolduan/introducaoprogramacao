/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;
/**
 *
 * @author ander
 */
public class JavaApplication1 {
    public static void main(String[] args) {
        float pe, pol, jarda, milha;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a quantidade de pés para a conversão em polegadas, jardas e milhas: ");
        pe = Float.valueOf(input.nextLine());
        
        pol = pe * 12;
        jarda = pe / 3;
        milha = jarda / 1760;
        
        System.out.println("O valor das conversões são:");
        System.out.println("Polegada: " + pol);
        System.out.println("Jarda: " + jarda);
        System.out.println("Milha: " + milha);
    }
    
}
