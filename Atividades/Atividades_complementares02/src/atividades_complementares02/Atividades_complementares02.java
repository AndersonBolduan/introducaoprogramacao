/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividades_complementares02;

import java.util.Scanner;
/**
 *
 * @author ander
 */
public class Atividades_complementares02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int peso;
        float altura, imc;
        boolean acima;
        Scanner input = new Scanner (System.in);
        
        System.out.print("Digite o seu peso: ");
        peso = Integer.valueOf(input.nextLine());
        
        System.out.print("Digite a sua altura: ");
        altura = Float.valueOf(input.nextLine());
        
        imc = peso / (altura*altura);
        System.out.println("O seu IMC é: " + imc);
        
        acima = imc > 25;
        System.out.println("Você está acima do peso? " + acima);
    }
    
}
