/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividades.pkg7_3;
import java.util.Scanner;
/**
 *
 * @author ander
 */
public class Atividades7_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//variáveis
        int idade, valor;
        String nome;
        Scanner input = new Scanner(System.in);
        
//Entrada de dados
        System.out.print("Digite o nome da pessoa: ");
        nome = input.nextLine();
        
        System.out.print("Digite a idade da pessoa: ");
        idade = Integer.valueOf(input.nextLine());
  
//Processamento de dados
        if (idade > 60) { 
            System.out.println(nome + " pagará RS 450,00 no plano");
            
        } else if (idade > 45) { 
            System.out.println(nome + " pagará R$ 350,00 no plano");
            
        } else if (idade >= 30) { 
            System.out.println(nome + " pagará R$ 210,00 no plano");
            
        } else if (idade > 10) {
            System.out.println(nome + " pagará R$ 120,00 no plano");
            
        } else {
            System.out.println(nome + " pagará R$ 80,00 no plano");
        }
    }
    
}
