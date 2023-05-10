/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade_dowhile_02;

import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Atividade_DoWhile_02 {

    static Scanner input = new Scanner (System.in);
    
    public static void main(String[] args) {
// Variáveis
        String nome;
        int diarias, conta1 = 0, conta2 = 0, conta3 = 0, total;
        
        System.out.print("Digite o seu nome: ");
        nome = input.nextLine();
        
        System.out.print("Digite a quantidade de diárias: ");
        diarias = Integer.valueOf(input.nextLine());
        
// Processamento de dados

        while (diarias < 10) {
            conta1 = diarias * 45;
        }
        
        while (diarias >= 10 && diarias <= 15) {
            conta2 = diarias * 45;
        }
        
        while (diarias > 15) {
            conta3 = diarias * 45;
        }
        
        total = conta1 + conta2 + conta3;
        
        mostraResultado("O preço da diária de a menos de 10 dias ficou em: ", conta1);
        mostraResultado("O preço da diária a entre 10 e 15 dias ficou em: ", conta2);
        mostraResultado("O preço da diária a mais de 15 dias ficou em: ", conta3);
    }
    
    public static void mostraResultado(String mensagem, int contaX) {
        System.out.println(mensagem + contaX);
    }
}
