/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividades_completares01;

import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Atividades_completares01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float preco, quilo, conta, contaAtraso;
        boolean elevado;
        Scanner input = new Scanner (System.in);
        
        System.out.print("Digite preço da conta: ");
        preco = Float.parseFloat(input.nextLine());
        
        System.out.print("Digite os Quilowatts usados: ");
        quilo = Float.parseFloat(input.nextLine());
        
        conta = preco * quilo;
        System.out.println("a conta ficou em: " + conta);
        
        contaAtraso = (float) (conta * 0.10) + conta;
        System.out.println("a conta com atraso ficou em: " + contaAtraso);
        
        elevado = quilo >= 70;
        System.out.println("a conta possui consumo elevado? " + elevado);
    }
    
}
