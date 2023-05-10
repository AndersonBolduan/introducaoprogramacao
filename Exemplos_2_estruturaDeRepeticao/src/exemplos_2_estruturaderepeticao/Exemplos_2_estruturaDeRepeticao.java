/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplos_2_estruturaderepeticao;

import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Exemplos_2_estruturaDeRepeticao {

    static Scanner input = new Scanner (System.in);
    
    public static void main(String[] args) {
        // variáveis
        
        int num, repeticao, soma = 0, contPositivo = 0, contNegativo = 0;
        System.out.print("quantos números irá digitar? ");
        repeticao = Integer.valueOf(input.nextLine());
        
        for (int i = 0; i < repeticao; i++){
        System.out.print("Digite um número: ");
        num = Integer.valueOf(input.nextLine());
        soma = soma + num;
        if(num > 0) {
            contPositivo++;
        } else {
            contNegativo ++;
        }
        int quadrado = num * num;
        System.out.println("O número ao quadrado é: " + quadrado);
        }
        System.out.println("Soma: " + soma);
        System.out.println("números positivos: " + contPositivo);
        System.out.println("números negativos " + contNegativo);
    }
    
}
