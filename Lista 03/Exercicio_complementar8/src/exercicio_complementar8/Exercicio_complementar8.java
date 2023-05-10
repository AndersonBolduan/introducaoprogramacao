/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio_complementar8;

import java.util.Scanner;


/**
 *
 * @author ander
 */
public class Exercicio_complementar8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float salMin, qVenda, vVenda, salario;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o valor do salário mínimo: ");
        salMin = Float.valueOf(input.nextLine());
        
        System.out.print("Digite a quantidade de vendas: ");
        qVenda = Float.valueOf(input.nextLine());
        
        System.out.print("Digite o valor das vendas: ");
        vVenda = Float.valueOf(input.nextLine());
        
        salario = (salMin * 2) + (150 * qVenda) + (float) (vVenda * 0.05);
        
        System.out.println("o salário que será pago será de: R$" + salario);
    }
    
}
