/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividades_11_4;

import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Atividades_11_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Variáveis

        int n1;
        double raiz = 0;
        Scanner input = new Scanner(System.in);
        
// Entrada de dados

        System.out.print("Digite o número: ");
        n1 = Integer.valueOf(input.nextLine());
        
// Processamento de dados
        
        if (n1 >= 0){
            raiz = raiz(n1);
        } else {
            System.out.println(erro(raiz));
        }
        
// Saída de dados

        System.out.println("A raiz de " + n1 + " é: " + raiz);
        
       
    }
    
    public static double raiz (double raiz) {
         raiz = Math.sqrt(raiz);
         return raiz;
    }
    
    public static String erro (double x){
       return "Imaginário";
    }
}
