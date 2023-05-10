/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculo_imc;

import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Calculo_IMC {

    static Scanner input = new Scanner (System.in);
    
    public static void main(String[] args) {
        // Variáveis
        
        float peso, altura, imc;
        char sexo;
        
        // Entrada de dados
        
        
        System.out.print("Digite o peso: ");
        peso = Float.valueOf(input.nextLine());
        
        System.out.print("Digite a altura: ");
        altura = Float.valueOf(input.nextLine());
             
        // Processamento de dados
        
        imc = peso / (altura * altura);
        
        // Saída de dados
        
        if (imc < 18.5) {
            System.out.println("O IMC é: " + imc);
            System.out.println("Seu IMC está Abaixo do Peso Normal");
        } else if (imc < 24.9) {
            System.out.println("O IMC é: " + imc);
            System.out.println("Seu IMC está Normal");
        } else if (imc < 29.9) {
            System.out.println("O IMC é: " + imc);
            System.out.println("Seu IMC está em Excesso de peso");
        } else if (imc < 34.9) {
            System.out.println("O IMC é: " + imc);
            System.out.println("Seu IMC está em Obesidade Classe I");
        } else if (imc < 39.9) {
            System.out.println("O IMC é: " + imc);
            System.out.println("Seu IMC está em Obesidade Classe II");
        } else {
            System.out.println("O IMC é: " + imc);
            System.out.println("Seu IMC está em Obesidade Classe III");
        }
        
    }
    
}
