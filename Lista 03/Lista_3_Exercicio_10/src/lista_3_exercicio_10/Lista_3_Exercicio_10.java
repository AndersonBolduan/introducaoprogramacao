/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista_3_exercicio_10;

import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Lista_3_Exercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Variáveis
        
        int x, y, z, somaXeY, somaXeZ, somaYeZ;
        Scanner input = new Scanner (System.in);
        
// Entrada de dados
        System.out.print("Digite o valor de X: ");
        x = Integer.valueOf(input.nextLine());
        
        System.out.print("Digite o valor de Y: ");
        y = Integer.valueOf(input.nextLine());
        
        System.out.print("Digite o valor de Z: ");
        z = Integer.valueOf(input.nextLine());
        
// Processamento e saída de dados
    
        somaXeY = x + y;
        
        somaXeZ = x + z;
        
        somaYeZ = y + z;

        if (somaYeZ > x && somaXeZ > y && somaXeY > z) {
            if (x == y || x == z || y == z) {
                System.out.println("É um triângulo isósceles");
            } else if (x == y && y == z) {
                System.out.println("É um triângulo equilátero");
            } else {
                System.out.println("É um triângulo escaleno");
            }
        } else {
            System.out.println("Não é um triângulo");
        }
        
    }
    
}
