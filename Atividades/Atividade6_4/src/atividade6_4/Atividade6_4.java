/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade6_4;

import java.util.Scanner;
/**
 *
 * @author ander
 */
public class Atividade6_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float preco, quilo, total;
        char atraso;
        Scanner input = new Scanner(System.in);
        //Entrada
        System.out.print("Digite o preço do quilowatt: ");
        preco = Float.valueOf(input.nextLine());
        
        System.out.print("Digite a quantidade do quilowatt usado: ");
        quilo = Float.valueOf(input.nextLine());
        
        System.out.print("A conta está em atraso? (Digite 'S' para sim e 'N' para não) ");
        atraso = input.nextLine().charAt(0);
        
        //Processamento de dados
        total = preco * quilo;
        if (atraso == 'S' || atraso == 's'){
            total = (float) (total + total * 0.10);
        }
        
        //Saída de dados
        System.out.println("O valor da conta ficou em: " + total);
    }
    
}
