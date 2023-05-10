/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividades_11_5;

import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Atividades_11_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Variáveis

        double nota1, nota2, nota3, mediaNotas;
        char media;
        Scanner input = new Scanner (System.in);
        
// Entrada de dados

        System.out.print("Digite a primeira nota: ");
        nota1 = Double.valueOf(input.nextLine());
        
        System.out.print("Digite a segunda nota: ");
        nota2 = Double.valueOf(input.nextLine());
        
        System.out.print("Digite a terceira nota: ");
        nota3 = Double.valueOf(input.nextLine());
        
        System.out.println("Qual o tipo de média deseja calcular?"
                + "\n A - Aritimética"
                + "\n P - Ponderada"
                + "\n G - Geométrica");
        media = input.nextLine().toUpperCase().charAt(0);
        
// Processamento de dados

        switch (media){
            case 'A': mediaNotas = calculeMediaAritimetica(nota1, nota2, nota3);
            System.out.println("a Media escolhida foi: " + media + " a média final ficou em: " + mediaNotas);
            break;
            case 'P': mediaNotas = calculeMediaPonderada(nota1, nota2, nota3);
            System.out.println("a Media escolhida foi: " + media + " a média final ficou em: " + mediaNotas);
            break;
            case 'G': mediaNotas = calculeMediaGeometrica(nota1, nota2, nota3);
            System.out.println("a Media escolhida foi: " + media + " a média final ficou em: " + mediaNotas);
            break;
        }
        
         
    }
    
    public static double calculeMediaAritimetica (double nota1, double nota2, double nota3){
        double media;
        
        media = (nota1 + nota2 + nota3) / 3;
        return media;
    }
    
    public static double calculeMediaPonderada (double nota1, double nota2, double nota3){
        double media;
        
        media = (1 * nota1 + 2 * nota2 + 2 * nota3) / (1 + 2 + 2);
        return media;
    }
    
    public static double calculeMediaGeometrica (double nota1, double nota2, double nota3){
        double media;
        
        media = nota1 * nota2 * nota3;
        media = Math.cbrt(media);
        
        return media;
    }
    
}
