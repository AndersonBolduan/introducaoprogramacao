/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio_desafio;

import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Exercicio_DESAFIO {

    static Scanner input = new Scanner (System.in);
    
    public static void main(String[] args) {
        // Variáveis
        
        int numInteiro, algarismo1, restoAlgarismo1, algarismo2, 
                restoAlgarismo2, algarismo3, restoAlgarismo3, 
                algarismo4, algarismo5, soma, resto, digitoVerificador;
        
        System.out.print("Digite o código para obter o dígito verificador: ");
        numInteiro = Integer.valueOf(input.nextLine());
        
        algarismo1 = numInteiro / 10000;
        restoAlgarismo1 = numInteiro % 10000;
        algarismo2 = restoAlgarismo1 / 1000;
        restoAlgarismo2 = restoAlgarismo1 % 1000;
        algarismo3 = restoAlgarismo2 / 100;
        restoAlgarismo3 = restoAlgarismo2 % 100;
        algarismo4 = restoAlgarismo3 / 10;
        algarismo5 = restoAlgarismo3 % 10;
        
        algarismo1 = calculoMultiplicacaoAlgarismo(algarismo1, 6);
        algarismo2 = calculoMultiplicacaoAlgarismo(algarismo2, 5);
        algarismo3 = calculoMultiplicacaoAlgarismo(algarismo3, 4);
        algarismo4 = calculoMultiplicacaoAlgarismo(algarismo4, 3);
        algarismo5 = calculoMultiplicacaoAlgarismo(algarismo5, 2);
        
        soma = algarismo1 + algarismo2 + algarismo3 + algarismo4 + algarismo5;
        
        resto = soma % 11;
        
        digitoVerificador = 11 - resto;
        
        System.out.println("Seu dígito verificador é: " + digitoVerificador);
    }
    
    public static int calculoMultiplicacaoAlgarismo(int algarismo, int x){
        return algarismo = algarismo * x;        
    }
    
}
