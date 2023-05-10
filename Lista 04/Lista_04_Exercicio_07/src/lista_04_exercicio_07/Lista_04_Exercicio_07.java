/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista_04_exercicio_07;

import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Lista_04_Exercicio_07 {

    static Scanner input = new Scanner (System.in);
    
    public static void main(String[] args) {
// Variáveis

        float saldoAtual, saldoNovo, juros;
        
// Entrada de dados
    
        System.out.print("Digite o saldo atual do cliente: ");
        saldoAtual = Float.valueOf(input.nextLine());
        
        System.out.print("Digite a porcentagem de juros do mês (Sem '%'): ");
        juros = Float.valueOf(input.nextLine());
        
// Processamento de dados

        saldoNovo = calculoDoNovoSaldo(saldoAtual, juros);
        
// Saída de dados

        System.out.println("O novo saldo do cliente é: " + saldoNovo);
        
    }
    
    public static float calculoDoNovoSaldo(float saldoAtual, float juros) {
        float saldoNovo;
        
        juros = juros / 100;
        
        return saldoNovo = saldoAtual * juros + saldoAtual;
    }
    
}
