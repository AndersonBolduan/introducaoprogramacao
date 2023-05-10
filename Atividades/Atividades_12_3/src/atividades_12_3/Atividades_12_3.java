/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividades_12_3;

import java.util.Scanner;


public class Atividades_12_3 {

    static Scanner input = new Scanner (System.in);
    
    public static void main(String[] args) {
// Variáveis
        
        int tipo;
        char caractere;
        
        System.out.print("Digite uma letra do alfabeto qualquer: ");
        caractere = input.nextLine().toLowerCase().charAt(0);
        
        tipo = verificaCaractere(caractere);
        escreveADefinicao(tipo);
    }
    
    public static int verificaCaractere (char caractere) {
        if (caractere == 'a' || caractere == 'e' || caractere == 'i'
                || caractere == 'o' || caractere == 'u') {
            caractere = 1;
        } else {
            caractere = 0;
        }
        return caractere;
    }
    
    public static void escreveADefinicao (int tipo) {
        if (tipo == 1) {
            System.out.println("A letra lida é uma vogal!");
        } else {
            System.out.println("A letra lida NÃO é uma vogal!");
        }
    }
}
