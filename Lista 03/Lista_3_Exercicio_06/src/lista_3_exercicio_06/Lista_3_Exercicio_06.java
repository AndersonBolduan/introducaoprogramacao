/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista_3_exercicio_06;

import java.util.Scanner;
/**
 *
 * @author ander
 */
public class Lista_3_Exercicio_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Variáveis
        int n1, n2, n3, menor;
        Scanner input = new Scanner (System.in);
        
// Entrada de Dados
        System.out.print("Digite o primeiro número: ");
        n1 = Integer.valueOf(input.nextLine());
        System.out.print("Digite o segundo número: ");
        n2 = Integer.valueOf(input.nextLine());
        System.out.print("Digite o terceiro número: ");
        n3 = Integer.valueOf(input.nextLine());
        
// Processamento de dados
        menor = Math.min(n1, n2);
        
        if (menor == n1) {
            menor = Math.min(n1,n3);
            System.out.println("O menor número é: " + menor);
        } else {
            menor = Math.min(n2, n3);
            System.out.println("O menor número é: " + menor);
        }
        
    }
    
}
