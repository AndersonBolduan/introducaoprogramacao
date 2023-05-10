/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividades_9_3;

import java.util.Scanner;
/**
 *
 * @author ander
 */
public class Atividades_9_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Variávies
        double preco, raio, altura, latas, laterais;
        Scanner input = new Scanner(System.in);

// Entrada de dados

        System.out.print("Digite o preço: ");
        preco = Double.parseDouble(input.nextLine());
        System.out.print("Digite o raio: ");
        raio = Double.parseDouble(input.nextLine());
        System.out.print("Digite a altura: ");
        altura = Double.parseDouble(input.nextLine());
        
// Processamento de dados

        laterais = (2 * Math.PI * raio * altura) + (2 * Math.PI * Math.pow(raio, 2)); 
       
        latas = laterais / 12;
        
        latas = Math.ceil(latas);
        
        preco = latas * preco;
        
// Saída de dados
        
        System.out.println("A área do cilíndro: " + laterais);
        System.out.println("A quantidade de latas é: " + latas);
        System.out.println("O preço total é de: " + preco);
    }
    
}
