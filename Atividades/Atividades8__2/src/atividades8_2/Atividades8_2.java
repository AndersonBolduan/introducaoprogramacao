/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividades8_2;

import java.util.Scanner;
/**
 *
 * @author ander
 */
public class Atividades8_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Variáeis
        float pesoBruto, tara, precoCarga, pesoLiquido, valor, imposto, total;
        int regiao;
        Scanner input = new Scanner(System.in);
        
//Entrada de Dados
        System.out.print("Digite o peso Bruto da carga em toneladas: ");
        pesoBruto = Float.valueOf(input.nextLine());
        
        System.out.print("Digite o preço da carga: ");
        precoCarga = Float.valueOf(input.nextLine());
        
        System.out.print("Digite a tara do caminhão: ");
        tara = Float.valueOf(input.nextLine());
        
        System.out.println("Digite a região que veio o caminhão");
        System.out.println("1 - Sul");
        System.out.println("2 - Sudeste");
        System.out.println("3 - Centro-Oeste");
        System.out.println("4 - Nordeste");
        System.out.println("5 - Norte");
        System.out.print("Digite a opção desejada: ");
        regiao = Integer.valueOf(input.nextLine());

//Processamento de Dados
        pesoLiquido = (pesoBruto - tara) * 1000;
        
        System.out.println("O peso da carga líquida em Kilos é de: " + pesoLiquido);
        
        pesoLiquido = pesoLiquido / 1000;
        
        valor = precoCarga * pesoLiquido;
        
        
        switch (regiao){
            case 1: imposto = (float) (valor * 0.1);
            System.out.println("O valor do imposto é: " + imposto);
            total = valor + imposto;
            System.out.println("O valor total a ser pago é: " + total);
            break;
            case 2: imposto = (float) (valor * 0.12);
            System.out.println("O valor do imposto é: " + imposto);
            total = valor + imposto;
            System.out.println("O valor total a ser pago é: " + total);
            break;
            case 3: imposto = (float) (valor * 0.09);
            System.out.println("O valor do imposto é: " + imposto);
            total = valor + imposto;
            System.out.println("O valor total a ser pago é: " + total);
            break;
            case 4: imposto = (float) (valor * 0.095);
            System.out.println("O valor do imposto é: " + imposto);
            total = valor + imposto;
            System.out.println("O valor total a ser pago é: " + total);
            break;
            case 5: imposto = (float) (valor * 0.08);
            System.out.println("O valor do imposto é: " + imposto);
            total = valor + imposto;
            System.out.println("O valor total a ser pago é: " + total);
            break;
            default: System.out.println("Digite um número válido");
        }

    }
    
}
