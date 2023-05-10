/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade_5;

import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Atividade_5 {

    static Scanner input = new Scanner (System.in);
    
    public static void main(String[] args) {
        // Variáveis
        int n, p, fatorialN, fatorialP, fatorialNP;
        
        n = leiaNumero("Digite o número de conjunto (n): ");
        p = leiaNumero ("Digite a quantidade de elementos (p): ");
        fatorialN = calculaFatorial(n);
        fatorialP = calculaFatorial(p);
        fatorialNP = calculaFatorial(n-p);
    }
    
    
    public static int leiaNumero (String mensagem){
        System.out.println(mensagem);
        return Integer.valueOf(input.nextLine());
    }
    
    public static int calculaFatorial(int x){
        int fatorialX = 1;
        
        for (int i =2; i > 1; i--){
            fatorialX = fatorialX * i;
        }
        return fatorialX;
    }
}
