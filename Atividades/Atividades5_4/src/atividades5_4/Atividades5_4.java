/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividades5_4;

import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Atividades5_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        boolean sens1,sens2,sens3,sens4,sens5,sens6,disparar,gato;
        Scanner input = new Scanner(System.in);
        System.out.print("Sensor 1 disparou? ");
        sens1=Boolean.parseBoolean(input.nextLine());
        
        System.out.print("Sensor 2 disparou? ");
        sens2=Boolean.parseBoolean(input.nextLine());
        
        System.out.print("Sensor 3 disparou? ");
        sens3=Boolean.parseBoolean(input.nextLine());
        
        System.out.print("Sensor 4 disparou? ");
        sens4=Boolean.parseBoolean(input.nextLine());
        
        System.out.print("Sensor 5 disparou? ");
        sens5=Boolean.parseBoolean(input.nextLine());
        
        System.out.print("Sensor 6 disparou? ");
        sens6=Boolean.parseBoolean(input.nextLine());
        
        gato = sens1&&sens5&&sens6==true;
        disparar = (sens1 || sens2 || sens3 || sens4 || sens5 || sens6) && !gato;
        
        System.out.println("O sensor dispara: " + disparar);
    }
    
}
