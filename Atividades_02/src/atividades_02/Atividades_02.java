/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividades_02;

import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Atividades_02 {

    static Scanner input = new Scanner (System.in);
    
    public static void main(String[] args) {
        // variáveis
        
       int alunos;
       
       // Entrada de dados
       System.out.print("Digite a quantidade de alunos: ");
       alunos = Integer.valueOf(input.nextLine());
       
       // Saída de dados
       calculoMediaDeIdades(alunos);
    }
    
    public static void calculoMediaDeIdades (int alunos){
       int idade, contIdades = 0;
       float media;
        
        for (int i = 0; i < alunos; i++){
       System.out.print("Digite a idade dos alunos: ");
       idade = Integer.valueOf(input.nextLine());
       
       contIdades = contIdades + idade;
       }
       
       media = (float) contIdades / alunos;
       
        System.out.println("A idade média é " + media);
       if (media < 12) {
           System.out.println("A turma é de Crianças");
       } else if (media <= 14) {
           System.out.println("A turma é de Adolescentes");
       } else if (media <= 18) {
           System.out.println("A turma é de Jovens");
       } else if (media >= 17) {
           System.out.println("A turma é de Adultos");
       }
    }
}
