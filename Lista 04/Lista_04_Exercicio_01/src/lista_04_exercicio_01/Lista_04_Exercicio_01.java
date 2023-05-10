/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista_04_exercicio_01;

import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Lista_04_Exercicio_01 {
    
    static Scanner input = new Scanner (System.in);
    
    public static void main(String[] args) {
// Variáveis
        int base, altura, area, perimetro;
        
// Entrada de dados
        System.out.print("Digite a base do retângulo: ");
        base = Integer.valueOf(input.nextLine());
        
        System.out.print("Digite a altura do retângulo: ");
        altura = Integer.valueOf(input.nextLine());
        
// Processamento de dados

        area = calculoDaArea(base, altura);
        perimetro = calculoDoPerimetro (base, altura);
        
// Saída de dados
        System.out.println("A area é de: " + area);
        System.out.println("O perimetro é de: " + perimetro);
    }
    
    
    public static int calculoDaArea(int base, int altura) {
        int area;
        
        return area = base * altura;
    }
    
    public static int calculoDoPerimetro (int base, int altura) {
        int perimetro;
        
        return perimetro = base * 2 + altura * 2;
    }
}
