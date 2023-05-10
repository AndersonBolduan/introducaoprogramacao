/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalho_empresadev;

import java.util.Scanner;
/**
 *
 * @author ander
 */
public class Trabalho_EmpresaDev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Variávies
        float tempo, horaDev, horaArq, totalDevArq, cadastro, 
                relatorioSimples, relatorioElaborado, 
                casoA, casoB, casoC, total;
        int desktop;
        Scanner input = new Scanner(System.in);  
        
//Entrada de dados               
        System.out.print("Digite a quantidade de cadastros: ");
        cadastro = Float.valueOf(input.nextLine());
        
        System.out.print("Digite a quantidade de relatórios simples: ");
        relatorioSimples = Float.valueOf(input.nextLine());
        
        System.out.print("Digite a quantidade de relatórios elaborados: ");
        relatorioElaborado = Float.valueOf(input.nextLine());
        
        System.out.print("Digite a quantidade de casos de uso A: ");
        casoA = Float.valueOf(input.nextLine());
        
        System.out.print("Digite a quantidade de casos de uso B: ");
        casoB = Float.valueOf(input.nextLine());
        
        System.out.print("Digite a quantidade de casos de uso C: ");
        casoC = Float.valueOf(input.nextLine());
        
        System.out.println("O cliente deseja qual interface? "
                + "Escolha entre as opções abaixo: ");
        System.out.println("1 - Interface Desktop");
        System.out.println("2 - Interface Web");
        System.out.println("3 - Interface Mobile");
        System.out.print("Qual interface? ");
        desktop = Integer.valueOf(input.nextLine());
        
//Processamento de dados
        casoA = casoA * 8;
        casoB = casoB * 16;
        casoC = casoC * 24;
        
        relatorioSimples = (float) (relatorioSimples / 2);
        
        cadastro = cadastro * 4;
        
        tempo = cadastro + relatorioSimples + relatorioElaborado + 
                casoA + casoB + casoC;
        
        switch (desktop){
            case 1: tempo = tempo;
            break;
            case 2: tempo = (float) (tempo + tempo * 0.15);
            break;
            case 3: tempo = (float) (tempo + tempo * 0.25);
          
        }
        
            horaDev = tempo * 50;
            horaArq = (float) (tempo * 0.2 * 80);
            total = horaDev + horaArq;
      
//Saída de dados        
        System.out.println("O Dev irá receber: " + horaDev);
        System.out.println("O Arquiteto irá receber: " + horaArq);
        System.out.println("O total a ser pago será: " + total);
    }
    
}
