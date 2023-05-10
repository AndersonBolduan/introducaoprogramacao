/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista_3_exercicio_08;

import java.util.Scanner;
/**
 *
 * @author ander
 */
public class Lista_3_Exercicio_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

// Variáveis

        float salarioAtual, salarioNovo;
        String nome;
        char categoria;
        
        Scanner input = new Scanner(System.in);
        
// Entrada de dados

        System.out.print("Digite o nome do funcionário: ");
        nome = input.nextLine();
        
        System.out.print("Digite a categoria do funcionário: ");
        categoria = input.nextLine().toUpperCase().charAt(0);
        
        System.out.print("Digite o salário atual do funcionário: ");
        salarioAtual = Float.valueOf(input.nextLine());
        
// Processamento de dados
        switch (categoria) {
            case 'A','H': salarioNovo = (float) (salarioAtual * 0.1 + salarioAtual);
            break;
            case 'B', 'D', 'E': salarioNovo = (float) (salarioAtual * 0.15 + salarioAtual);
            break;
            case 'C', 'F': salarioNovo = (float) (salarioAtual * 0.25 + salarioAtual);
            break;
            default: salarioNovo = (float) (salarioAtual * 0.3 + salarioAtual);
            break;
        }
        
// Saída de dados
        System.out.println("O funcionário " + nome + " da categoria " + categoria + 
                " receberá o salário no valor de R$ " + salarioNovo);
        
    }
    
}
