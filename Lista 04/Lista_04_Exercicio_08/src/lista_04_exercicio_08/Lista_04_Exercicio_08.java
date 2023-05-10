/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista_04_exercicio_08;

import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Lista_04_Exercicio_08 {

    static Scanner input = new Scanner (System.in);
    
    public static void main(String[] args) {
// Variáveis

        float valorVenda;
        int x;
        
// Entrada de dados

        System.out.print("Digite o valor da venda: R$ ");
        valorVenda = Float.valueOf(input.nextLine());
        
        System.out.println("""
                         Escolha a forma de pagamento -
                          1 - Venda a Vista - Desconto de 10%
                          2 - Venda a Prazo 30 Dias - Desconto de 5%
                          3 - Venda a Prazo 60 Dias - Mesmo Preço
                          4 - Venda a Prazo 90 Dias - Acréscimo de 5%
                          5 - Venda com cartão de débito - Desconto de 7%
                          6 - Venda com cartão de crédito - Desconto de 5%""");
        x = Integer.valueOf(input.nextLine());
        
// Processamento de dados

        

        calculoDoValorFinal (valorVenda, x);
    }
    
    public static void calculoDoValorFinal (float valorVenda, int porcentagem) {
            
            switch (porcentagem) {
                case 1: valorVenda = (float) (valorVenda - (valorVenda * 0.10));
                System.out.println("O valor da venda ficou em: " + valorVenda);
                break;
                
                case 2: valorVenda = (float) (valorVenda - (valorVenda * 0.05));
                System.out.println("O valor da venda ficou em: " + valorVenda);
                break;
                
                case 3: System.out.println("O valor da venda ficou em: " + valorVenda);
                break;
                
                case 4: valorVenda = (float) (valorVenda + (valorVenda * 0.05));
                System.out.println("O valor da venda ficou em: " + valorVenda);
                break;
                
                case 5: valorVenda = (float) (valorVenda - (valorVenda * 0.07));
                System.out.println("O valor da venda ficou em: " + valorVenda);
                break;
                
                case 6: valorVenda = (float) (valorVenda - (valorVenda * 0.05));
                System.out.println("O valor da venda ficou em: " + valorVenda);
                break;
                
                default: System.out.println("Opção Inválida.");
        }
        
    }
}