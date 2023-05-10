/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prova29_03_2023_03;

import java.util.Scanner;
/**
 *
 * @author ander
 */
public class Prova29_03_2023_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valorComp, valorPago, valorTroco, nota100, nota10, nota1, resto;
        Scanner input = new Scanner (System.in);
        
        System.out.print("Digite o valor da compra: ");
        valorComp = Integer.valueOf(input.nextLine());
        
        System.out.print("Digite o valor pago: ");
        valorPago = Integer.valueOf(input.nextLine());
        
        valorTroco = valorPago - valorComp;
        
        nota100 = valorTroco/100;
        resto = valorTroco%100;
        nota10 = resto/10;
        nota1 = resto%10;
        
        System.out.println("Valor do troco a ser dado: " + valorTroco);
        System.out.println("Notas de 100: " + nota100);
        System.out.println("Notas de 10: " + nota10);
        System.out.println("Notas de 1: " + nota1);
    }
    
}
