/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividades_12_4;

import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Atividades_12_4 {

    static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {
// Variáveis
        int num;
        boolean tipo;
        
// Entrada de dados

        System.out.print("Digite o número inteiro");
        num = Integer.valueOf(input.nextLine());
        
        tipo = calculaRaizQuadrada(num);
        
        if (tipo == true) {
            
        }
    }
    
    
    public static boolean calculaRaizQuadrada (int num) {
        double raiz;
        boolean tipo;
        raiz = Math.sqrt(num);
        
        if (num % raiz == 0) {
            tipo = true;
        } else {
            tipo = false;
        }
        
        return tipo;
    }
}
