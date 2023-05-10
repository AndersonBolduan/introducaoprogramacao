/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividades6_3;

import java.util.Scanner;
/**
 *
 * @author ander
 */
public class Atividades6_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float preco, quantidade, total;
        Scanner input = new Scanner (System.in);
        
        System.out.print("Digite o preço do produto: ");
        preco = Float.valueOf(input.nextLine());
        
        System.out.print("Digite a quantidade do produto: ");
        quantidade = Float.valueOf(input.nextLine());
        
        if (preco >= 0 && quantidade >= 0) {
            total = preco * quantidade;
            System.out.println("O valor da compra é: " + total);
        } else {
            System.out.println("Erro");
        }
    }   
}
