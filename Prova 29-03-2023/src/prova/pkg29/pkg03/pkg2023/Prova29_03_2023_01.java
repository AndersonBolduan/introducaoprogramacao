/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prova.pkg29.pkg03.pkg2023;

import java.util.Scanner;
/**
 *
 * @author ander
 */
public class Prova29_03_2023_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int quantidade, preco;
        float precoUnit, total;
        String produto; 
        Scanner input = new Scanner (System.in);
        
        System.out.print("Digite o produto que foi pego: ");
        produto = input.nextLine();
        
        System.out.print("Digite a quantidade do produto: ");
        quantidade = Integer.valueOf(input.nextLine());
        
        System.out.print("Digite o valor unitário do produto: ");
        preco = Integer.valueOf(input.nextLine());
        
        precoUnit = (float) ((float) preco - preco * 0.08);
        
        total = precoUnit * quantidade;
        
        System.out.println("Preço unitário: " + precoUnit);
        System.out.println("Total a pagar: " + total);
    }
    
}
