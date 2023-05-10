/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividades_complementares07;

import java.util.Scanner;
/**
 *
 * @author ander
 */
public class Atividades_Complementares07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int altura, comprimento, largura, areaPiso, areaParede, volume;
        boolean arPequeno, arMedio, arGrande;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a altura da sala: ");
        altura = Integer.valueOf(input.nextLine());
        
        System.out.print("Digite o comprimento da sala: ");
        comprimento = Integer.valueOf(input.nextLine());
        
        System.out.print("Digite a largura da sala: ");
        largura = Integer.valueOf(input.nextLine());
        
        areaPiso = comprimento * largura;
        
        areaParede = comprimento * altura;
        
        volume = comprimento * altura * largura;
        
        arPequeno = volume < 100;
        
        arMedio = volume > 100 && volume < 500;
        
        arGrande = volume > 500;
        
        System.out.println ("a área do piso é: " + areaPiso);
        System.out.println ("a área da parede é: " + areaParede);
        System.out.println ("o volume da sala é: " + volume);
        System.out.println ("Pode instalar um ar pequeno? " + arPequeno);
        System.out.println ("Pode instalar um ar medio? " + arMedio);
        System.out.println ("Pode instalar um ar grande? " + arGrande);
    }
    
}
