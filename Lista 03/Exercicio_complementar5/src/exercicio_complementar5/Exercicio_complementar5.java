/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio_complementar5;

import java.util.Scanner;
/**
 *
 * @author ander
 */
public class Exercicio_complementar5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int base, altura, area, perimetro;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a base do triângulo: ");
        base = Integer.valueOf(input.nextLine());
        
        System.out.print("Digite a altura do triângulo: ");
        altura = Integer.valueOf(input.nextLine());
        
        area = base * altura;
        perimetro = (base+altura) * 2;
        
        System.out.println("A Área do triângulo é: " + area);
        System.out.println("O perímetro do triângulo é: " + perimetro);
    }
    
}
