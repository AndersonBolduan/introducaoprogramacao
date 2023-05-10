/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista_3_exercicio_03;

import java.util.Scanner;
/**
 *
 * @author ander
 */
public class Lista_3_Exercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Vairáveis
        int peso;
        float altura, imc;
        String situacao;
        Scanner input = new Scanner(System.in);
        
//Entrada de dados
        System.out.print("Digite o peso: ");
        peso = Integer.valueOf(input.nextLine());
        
        System.out.print("Digite a altura: ");
        altura = Float.valueOf(input.nextLine());
        
//Processamento de dados
        imc = peso / (altura*altura);
        
        System.out.println("O seu imc é: " + imc);
        
        if (imc < 20) {
            System.out.println("Magro");
        }else if (imc > 20 && imc < 24.99){
            System.out.println("Normal");
        } else if (imc > 25 && imc < 30) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obeso");
        }
    }
    
}
