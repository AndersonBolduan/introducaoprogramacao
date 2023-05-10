/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista_3_exercicio_01;

import java.util.Scanner;
/**
 *
 * @author ander
 */
public class Lista_3_exercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variáveis
        float preco, quilo, conta;
        boolean atraso;
        Scanner input = new Scanner (System.in);
//Entrada de dados 
        System.out.print("Digite o preço do quilowatt: ");
        preco = Float.valueOf(input.nextLine());
        
        System.out.print("Digite a quantidade de Quilowatts: ");
        quilo = Float.valueOf(input.nextLine());
        
        System.out.print("A conta está em atraso? (True/False) ");
        atraso = Boolean.valueOf(input.nextLine());
        
//Processamento de dados
        if(atraso == true) {
            conta = preco * quilo;
            conta = (float) (conta * 0.1 + conta);
            
        } else {
            conta = preco * quilo;
        }
        
        System.out.println("O valor da conta ficou em: " + conta);
        
        if (quilo > 70) {
            System.out.println("Consumo elevado de energia!");
        } else {
            System.out.println("Você é um consumidor consciente!");
        }

    }
    
}
