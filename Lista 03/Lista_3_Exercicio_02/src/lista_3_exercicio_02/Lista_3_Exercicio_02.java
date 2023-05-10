/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista_3_exercicio_02;

import java.util.Scanner;
/**
 *
 * @author ander
 */
public class Lista_3_Exercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variáveis
        int prova1, prova2, trabalho;
        Scanner input = new Scanner(System.in);
        
//Entradada de dados
        System.out.print("Digite a nota da primeira prova: ");
        prova1 = Integer.valueOf(input.nextLine());
        
        System.out.print("Digite a nota da segunda prova: ");
        prova2 = Integer.valueOf(input.nextLine());
        
        System.out.print("Digite a nota do trabalho: ");
        trabalho = Integer.valueOf(input.nextLine());
        
//Processamento de dados
        if ((prova1 >= 6 || prova2 >= 6) && trabalho >= 7) {
            System.out.println("Parabéns, você foi aprovado");
        } else {
            System.out.println("Infelizmente, você não foi aprovado");
        }
    }  
}
