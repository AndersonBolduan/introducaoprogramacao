/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;
/**
 *
 * @author ander
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float despesa, gorjeta, total;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Coloque o valor da despesa: ");
        despesa = Float.valueOf(input.nextLine());
        
        gorjeta = (float) (despesa * 0.1);
        total = (float) despesa + gorjeta;
        
        System.out.println ("O total da conta do cliente foi: "+ total);
        
    }
    
}
