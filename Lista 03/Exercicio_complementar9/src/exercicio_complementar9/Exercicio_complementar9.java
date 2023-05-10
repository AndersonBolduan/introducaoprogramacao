/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio_complementar9;

import java.util.Scanner;
/**
 *
 * @author ander
 */
public class Exercicio_complementar9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float lLeite, qCafe, pBolacha, cLeite, cCafe, cBolacha, gCafe, gLeite, gBolacha, gTotal;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite os quilos de café que possui: ");
        qCafe = Float.valueOf(input.nextLine());
        
        System.out.print("Digite o valor do quilo do café: ");
        cCafe = Float.valueOf(input.nextLine());
        
        System.out.print("Digite os litros de leite: ");
        lLeite = Float.valueOf(input.nextLine());
        
        System.out.print("Digite o valor do litro de leite: ");
        cLeite = Float.valueOf(input.nextLine());
        
        System.out.print("Digite quantos pacotes de bolacha possui: ");
        pBolacha = Float.valueOf(input.nextLine());
        
        System.out.print("Digite o valor do pacote de bolacha: ");
        cBolacha = Float.valueOf(input.nextLine());
        
        gCafe = qCafe * cCafe;
        gLeite = lLeite * cLeite;
        gBolacha = pBolacha * cBolacha;
        gTotal = gCafe + gLeite + gBolacha;
        
        System.out.println("O valor gasto com o Café foi: " + gCafe);
        System.out.println("O valor gasto com o Leite foi: " + gLeite);
        System.out.println("O valor gasto com o Bolacha foi: " + gBolacha);
        System.out.println("O valor gasto no total foi: " + gTotal);
    }
    
}
