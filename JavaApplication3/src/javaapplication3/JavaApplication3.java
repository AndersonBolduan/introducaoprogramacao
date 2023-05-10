/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;
/**
 *
 * @author ander
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cdu, centena, restoCentena, dezena, unidade, udc;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o número em formato CDU (Centena, Dezena e Unidade): ");
        cdu = Integer.valueOf(input.nextLine());
        
        centena = cdu / 100;
        restoCentena = cdu % 100;
        dezena = restoCentena / 10;
        unidade = restoCentena % 10;
        udc = unidade * 100 + dezena * 10 + centena;
        
        System.out.println("Resultado: " + udc);
        
    }
    
}
