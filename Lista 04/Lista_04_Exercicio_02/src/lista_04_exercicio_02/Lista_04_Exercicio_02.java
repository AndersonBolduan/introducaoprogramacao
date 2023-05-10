/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista_04_exercicio_02;

import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Lista_04_Exercicio_02 {

    static Scanner input = new Scanner (System.in);
    
    public static void main(String[] args) {
// Variáveis

        int num1, num2, soma, subtracao, multiplicacao;
        double divisao;
        
// Entrada de dados

        System.out.print("Digite o primeiro número: ");
        num1 = Integer.valueOf(input.nextLine());
        
        System.out.print("Digite o segundo número: ");
        num2 = Integer.valueOf(input.nextLine());
        
// Processamento de dados

        soma = calculoDaSoma(num1,num2);
        subtracao = calculoDaSubtracao(num1,num2);
        divisao = calculoDaDivisao(num1,num2);
        multiplicacao = calculoDaMultiplicacao(num1,num2);
        
// Saída de dados
    
        System.out.println("A soma dos números: " + soma);
        System.out.println("A subtração dos números: " + subtracao);
        System.out.println("A divisão dos números: " + divisao);
        System.out.println("A multiplicacao dos números: " + multiplicacao);
    }
    
    
    public static int calculoDaSoma(int num1, int num2) {
        int soma;
        
        return soma = num1+num2;
    }
    
    public static int calculoDaSubtracao(int num1, int num2) {
        int subtracao;
        
        return subtracao = num1 - num2;
    }
    
    public static double calculoDaDivisao(int num1, int num2) {
        double divisao;
        
        return divisao = num1/num2;
    }
    
    public static int calculoDaMultiplicacao (int num1, int num2) {
        int multiplicacao;
        
        return multiplicacao = num1 * num2;
    }
}
