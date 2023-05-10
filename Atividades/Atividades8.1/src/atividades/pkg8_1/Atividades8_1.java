/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividades.pkg8_1;

import java.util.Scanner;
/**
 *
 * @author ander
 */
public class Atividades8_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variáveis
        int x;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a opção que deseja realizar");
        System.out.println("1 - Cadastrar Cliente");
        System.out.println("2 - Editar Cliente");
        System.out.println("3 - Cadastrar Produto");
        System.out.println("4 - Editar Produto");
        System.out.println("5 - Efetuar Venda");
        System.out.println("6 - Sair");
        System.out.println("Digite a opção desejada");
        x = Integer.parseInt(input.nextLine());
        
        switch (x){
            case 1: System.out.println("Você escolheu a opção - 1 - Cadastrar Cliente");
            break;
            case 2: System.out.println("Você escolheu a opção - 2 - Editar Cliente");
            break;
            case 3: System.out.println("Você escolheu a opção - 3 - Cadastrar Produto");
            break;
            case 4: System.out.println("Você escolheu a opção - 4 - Editar Produto");
            break;
            case 5: System.out.println("Você escolheu a opção - 5 - Efetuar Venda");
            break;
            case 6: System.out.println("Você escolheu a opção - 6 - Sair");
            break;
            default:  System.out.println("Você não escolheu uma opção válida");

        }
    }
    
}
