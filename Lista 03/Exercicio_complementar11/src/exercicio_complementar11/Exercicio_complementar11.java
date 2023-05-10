/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio_complementar11;

import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Exercicio_complementar11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print ("Digite o tempo em segundos: ");
        int tempo = Integer.valueOf(input.nextLine());
        
        int horas = tempo / 3600;
        int resto =  tempo % 3600;
        int minutos = resto / 60;
        int segundos = resto % 60;
        
        System.out.println ("O video tem duração de: " + horas + "h" + minutos + "m" + segundos + "s");
    }
    
}
