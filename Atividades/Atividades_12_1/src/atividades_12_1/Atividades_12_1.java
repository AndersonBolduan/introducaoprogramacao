/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividades_12_1;

import java.util.Scanner;

public class Atividades_12_1 {
    static int numGlobal;
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
// Entrada de dados       
        System.out.print("Digite o número GLOBAL: ");
        numGlobal = Integer.valueOf(input.nextLine());
        
        numeroEResultado();
        
    }
    
    public static void numeroEResultado() {
        int numeroFuncao, calculo;
        
        System.out.print("Digite o número da FUNÇÃO: ");
        numeroFuncao = Integer.valueOf(input.nextLine());
        
        calculo = numGlobal + numeroFuncao;
        
        System.out.println("A soma dos valores é: " + calculo);
    }
}
