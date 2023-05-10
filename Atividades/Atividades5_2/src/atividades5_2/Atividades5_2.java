/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividades5_2;

import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Atividades5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int ano, resto;
            boolean bissexto;
            Scanner input = new Scanner (System.in);
            
            System.out.print("Digite o ano: ");
            ano = Integer.valueOf(input.nextLine());
            
            bissexto = (ano%4==0)&&(ano%100!=0 || ano%400==0);
            
            System.out.println("Bissexto: " + bissexto);
    }
    
}
