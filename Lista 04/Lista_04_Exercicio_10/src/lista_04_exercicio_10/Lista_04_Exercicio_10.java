/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista_04_exercicio_10;

import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Lista_04_Exercicio_10 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
// Variáveis

        int peso;
        float altura, imc;
        boolean acima;

// Entrada de dados
        System.out.print("Digite o seu peso: ");
        peso = Integer.valueOf(input.nextLine());

        System.out.print("Digite a sua altura: ");
        altura = Float.valueOf(input.nextLine());

// Processamento de dados
        imc = calculoDoIMC(peso, altura);
        
        acima = imc>25;
        
// Saída de dados

        System.out.println("O seu IMC é de: " + imc);
        System.out.println("você está acima do peso ideal?" + acima);
    }

    public static float calculoDoIMC(int peso, float altura) {
        float imc;
        
        return imc = peso / (altura * altura);
    }
}
