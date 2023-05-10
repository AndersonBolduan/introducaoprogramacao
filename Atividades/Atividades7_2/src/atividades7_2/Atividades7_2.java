/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividades7_2;

import java.util.Scanner;
/**
 *
 * @author ander
 */
public class Atividades7_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Variáveis
        int valorCompra, desconto;
        Scanner input = new Scanner(System.in);
        
//Entrada de dados
        System.out.print("Digite o valor da compra: ");
        valorCompra = Integer.valueOf(input.nextLine());
        
//Processamento de dados        
        if (valorCompra >= 5000) {
            desconto = (int) (valorCompra * 0.2);
            
        } else if (valorCompra >= 3000) {
            desconto = (int) (valorCompra * 0.15);
      
        } else {
            desconto = (int) (valorCompra * 0.10);
           
        }
        
        valorCompra = valorCompra - desconto;
//Saída de dados
        System.out.println("O valor de desconto é de: " + desconto);
        System.out.println("O valor total da compra é de: " + valorCompra);
    }
    
}
