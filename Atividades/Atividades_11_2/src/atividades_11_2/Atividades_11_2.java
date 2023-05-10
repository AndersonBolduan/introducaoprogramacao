/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividades_11_2;

import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Atividades_11_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Variáveis

        double precoAntigo, precoNovo, acrescimo, possibilidade;
        Scanner input = new Scanner(System.in);
// Entrada de dados
        System.out.print("Digite o preço antigo: ");
        precoAntigo = Double.valueOf(input.nextLine());
        
        System.out.print("Digite o preco novo: ");
        precoNovo = Double.valueOf(input.nextLine());
        
// Processamento de dados

        verificaPossibilidade (precoAntigo, precoNovo);
        
// Saída de dados
        
    }
    
    public static double calculeAcrescimo (double precoAntigo, double precoNovo){
        double acrescimo;
        return acrescimo = (precoNovo - precoAntigo) / precoAntigo * 100;        
   } 
    
    public static void verificaPossibilidade (double precoAntigo, double precoNovo){
        double acrescimo;
        
        acrescimo = calculeAcrescimo (precoAntigo, precoNovo);
        
        if (acrescimo >= 0) {
            System.out.println("O acréscimo é de: " + acrescimo + "%");
        } else {
            System.out.println("Erro");
        }
    }
}
