/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividades_complementaresdesafio;

import java.util.Scanner;
/**
 *
 * @author ander
 */
public class Atividades_complementaresDESAFIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float pista;
        int peso, visibilidade, chuva, passageiros;
        boolean sistema, decola, pistaPeso, visibilidadeSis, chuvaDecola, chuvaPassageiros;
        Scanner input = new Scanner (System.in);
        System.out.print("Digite o tamanho da pista: ");
        pista = Float.valueOf(input.nextLine());
        
        System.out.print("Digite o peso do avião: ");
        peso = Integer.valueOf(input.nextLine());
        
        System.out.print("Digite a visibilidade: ");
        visibilidade = Integer.valueOf(input.nextLine());
        
        System.out.print("Digite a intensidade da chuva: ");
        chuva = Integer.valueOf(input.nextLine());
        
        System.out.print("Digite a quantidade de passageiros: ");
        passageiros = Integer.valueOf(input.nextLine());
        
        System.out.print("Existe sistema de decolagem? ");
        sistema = Boolean.valueOf(input.nextLine());
        
        pistaPeso = (pista < 1.5 && peso < 40)||((pista >= 1.5 || pista < 2)&& peso < 60)||(pista > 2);
        
        visibilidadeSis = visibilidade >= 20 || sistema==true;
        
        chuvaDecola = chuva < 5;
        
        chuvaPassageiros = !(passageiros > 100 && chuva > 0);
        
        decola = pistaPeso && visibilidadeSis && chuvaDecola && chuvaPassageiros;
        
        System.out.println("O avião pode decolar? " + decola);
    }
    
}
