/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste_supresa_01;

import java.util.Scanner;
/**
 *
 * @author ander
 */
public class Teste_Supresa_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Variáveis

        int base, altura, forma;
        Scanner input  = new Scanner(System.in);
        
// entrada de dados
    
        System.out.print("Digite a base da figura: ");
        base = Integer.valueOf(input.nextLine());
        
        System.out.print("Digite a altura da figura: ");
        altura = Integer.valueOf(input.nextLine());
        
        System.out.println("O que é a figura?"
                + "\n 1 - é um quadrado?"
                + "\n 2 - é um triangulo?");
        forma = Integer.valueOf(input.nextLine());
        
// Processamento de dados
    
        switch(forma){
            case 1: forma = base * altura;
            break;
            case 2: forma = base * altura / 2;
            break;
            default: System.out.println("Escolha uma opção válida");
        }
        
// Saída de dados

        System.out.println("A área da figura é de: " + forma);
    }
    
}
