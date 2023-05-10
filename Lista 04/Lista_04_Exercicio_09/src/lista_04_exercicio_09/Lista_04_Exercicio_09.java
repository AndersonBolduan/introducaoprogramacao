/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista_04_exercicio_09;

import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Lista_04_Exercicio_09 {

    static Scanner input = new Scanner (System.in);
    
    public static void main(String[] args) {
// Variáveis

        int salMin, vendas;
        float valorVendas;
        
// Entrada de dados

        System.out.print("Digite o salário mínimo: ");
        salMin = Integer.valueOf(input.nextLine());
        
        System.out.print("Digite a quantidade de carros vendidos: ");
        vendas = Integer.valueOf(input.nextLine());
        
        System.out.print("Digite o valor das vendas: ");
        valorVendas = Integer.valueOf(input.nextLine());
        
// Processamento de dados

        salMin = salMin * 2;
        vendas = 150 * vendas;
        valorVendas = (float) (valorVendas * 0.05);
        
        somaDoSalario (salMin,vendas,valorVendas);
    }
    
    public static void somaDoSalario (int salMin, int vendas, float valorVendas) {
        float salario;
        
        salario = salMin + vendas + valorVendas;
        System.out.println("O salário final é de: " + salario);
    }
    
}
