/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista_3_exercicio_11;

import java.util.Scanner;
/**
 *
 * @author ander
 */
public class Lista_3_Exercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Variáveis

        int hora, minuto, segundo;
        Scanner input = new Scanner(System.in);
        
// Entrada de dados

        System.out.print("Digite as horas: ");
        hora = Integer.valueOf(input.nextLine());
        
        System.out.print("Digite os minutos: ");
        minuto = Integer.valueOf(input.nextLine());
        
        System.out.print("Digite os segundos: ");
        segundo = Integer.valueOf(input.nextLine());
        
// Processamento de dados
        
        if (segundo == 59 && segundo < 60) {
            segundo = segundo - 59;
            if (minuto == 59 && minuto < 60) {
                minuto = minuto - 59;
                hora = hora + 1;
            } else {
                minuto = minuto + 1;
            }
        } else {
            segundo = segundo + 1;
        }
        
// Saída de dados
        
        System.out.println("o horário passou a ser : " + hora + "h" + minuto + "m" 
                + segundo + "seg.");
    }
    
}
