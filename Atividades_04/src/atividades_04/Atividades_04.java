/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividades_04;

import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Atividades_04 {

    static Scanner input = new Scanner (System.in);
    
    public static void main(String[] args) {
        // Variáveis
        
        int num1, num2, fatorial1, fatorial2, somaFatorial;
        
        num1 = leiaNumero();
        
        num2 = leiaNumero();
        
        fatorial1 = calculeFatorial(num1);
        fatorial2 = calculeFatorial(num2);
        somaFatorial = fatorial1 + fatorial2;
        
        mostraResultado(fatorial1, fatorial2, somaFatorial);
    }
    
    
    public static int leiaNumero () {
        System.out.println("Digite o número: ");
        return Integer.valueOf(input.nextLine());
    }
    
    
    public static int calculeFatorial (int n) {
        int fat = 1;
        
        for (int i =2; i <= n; i++){
            fat = fat * i;
        }
        return fat;
        
    }
    
    
    public static void mostraResultado (int fatorial1, int fatorial2, int somaFatorial){
        System.out.println("O fatorial do primeiro número é: " + fatorial1);
        System.out.println("O fatorial do segundo número é: " + fatorial2);
        System.out.println("A soma dos fatores é de: " + somaFatorial);
    }
}
