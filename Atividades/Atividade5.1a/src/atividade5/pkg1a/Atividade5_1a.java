/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade5.pkg1a;

import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Atividade5_1a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float nota1, nota2, nota3, falta, media;
        boolean aprovado, atestado;
        Scanner input = new Scanner (System.in);
        System.out.print("Digite a nota 1: ");
        nota1 = Float.valueOf(input.nextLine());
        
        System.out.print("Digite a nota 2: ");
        nota2 = Float.valueOf(input.nextLine());
        
        System.out.print("Digite a nota 3: ");
        nota3 = Float.valueOf(input.nextLine());
        
        System.out.print("Digite as faltas: ");
        falta = Float.valueOf(input.nextLine());
        
        System.out.print("Tem atestado? ");
        atestado = Boolean.valueOf(input.nextLine());
        
        media = (nota1+nota2+nota3)/3;
        aprovado = media >= 6 && (falta <= 25 || atestado == true);
        
        System.out.println("Aprovado? " + aprovado);
    }
    
}