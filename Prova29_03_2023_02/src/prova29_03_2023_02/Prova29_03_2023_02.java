/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prova29_03_2023_02;

import java.util.Scanner;
/**
 *
 * @author ander
 */
public class Prova29_03_2023_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome;
        float portugues, matematica, gerais, media;
        boolean aprovado;
        Scanner input = new Scanner (System.in);
        
        System.out.print ("Qual o nome do candidato? ");
        nome = input.nextLine();
        
        System.out.print("Qual a nota que o candidato tirou em português? ");
        portugues = Float.valueOf(input.nextLine());
        
        System.out.print("Qual a nota que o candidato tirou em matemática? ");
        matematica = Float.valueOf(input.nextLine());
        
        System.out.print("Qual a nota que o candidato tirou em gerais? ");
        gerais = Float.valueOf(input.nextLine());
        
        media = (portugues + matematica + gerais) / 3;
        
        aprovado = (media >= 7 && portugues >= 5 && matematica >= 5 && gerais >= 5);
        
        System.out.println("Nome: " + nome);
        System.out.println("Aprovado: " + aprovado);
    }
    
}
