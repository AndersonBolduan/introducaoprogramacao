/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio_desafioaula;

import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Exercicio_DESAFIOAula {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
// Variáveis

        int num, penultimo, ultimo, novo;
        
        
        num = leiaNumero();
        gereSerieFibonacci(num);
        
        penultimo = leiaTermosRicci("primeiro");
        ultimo = leiaTermosRicci("segundo");
        gereSerieRicci(num, penultimo, ultimo);
        
    }
    
    public static int leiaTermosRicci(String valor) {
        int penultimo;
        
        System.out.println("Digite o " + valor + " termo para Ricci: ");
        return penultimo = Integer.valueOf(input.nextLine());
    }

    public static void gereSerieRicci(int n, int penultimo, int ultimo) {

        gereSerie(n, penultimo, ultimo);
    }

    public static void gereSerieFibonacci(int n) {
        gereSerie (n, 0, 1);
    }

    public static void gereSerie(int n, int penultimo, int ultimo) {
        int novo = 0;

        System.out.print(penultimo + " " + ultimo + " ");
        for (int i = 2; i < n; i++) {
            novo = ultimo + penultimo;
            System.out.print(novo + " ");
            penultimo = ultimo;
            ultimo = novo;
        }

    }

    public static int leiaNumero() {
        int num;

        System.out.print("Digite um número entre 3 e 20: ");
        num = Integer.valueOf(input.nextLine());

        while (num < 3 && num > 20) {
            System.out.println("Digite o número novamente");
            num = Integer.valueOf(input.nextLine());
        }

        return num;
    }

}
