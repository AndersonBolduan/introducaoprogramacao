/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividades5_3;

import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Atividades5_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int diaAtual,mesAtual,anoAtual,diaVencimento,mesVencimento,anoVencimento;
        boolean vencido;
        Scanner input = new Scanner (System.in);
        System.out.print("Digite o dia atual: ");
        diaAtual=Integer.valueOf(input.nextLine());
        System.out.print("Digite o mês atual: ");
        mesAtual=Integer.valueOf(input.nextLine());
        System.out.print("Digite o ano atual: ");
        anoAtual=Integer.valueOf(input.nextLine());
        System.out.print("Digite o dia de vencimento: ");
        diaVencimento=Integer.valueOf(input.nextLine());
        System.out.print("Digite o mês de vencimento: ");
        mesVencimento=Integer.valueOf(input.nextLine());
        System.out.print("Digite o ano de vencimento: ");
        anoVencimento=Integer.valueOf(input.nextLine());
        
        vencido = (diaAtual>=diaVencimento)&&(mesAtual>=mesVencimento)&&(anoAtual>=anoVencimento);
        
        System.out.println("A conta está vencida? "+vencido);
    }
    
}
