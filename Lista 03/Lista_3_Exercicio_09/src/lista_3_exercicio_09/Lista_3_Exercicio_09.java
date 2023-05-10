/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista_3_exercicio_09;

import java.util.Scanner;
/**
 *
 * @author ander
 */
public class Lista_3_Exercicio_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Variáveis
        String numero;
        int saldoAtual, novoSaldo = 0, operacao, valor;
        
        Scanner input = new Scanner (System.in);
        
// Entrada de dados
        System.out.print("Digite o número da conta: ");
        numero = input.nextLine();
        
        System.out.print("Digite o saldo atual da conta: ");
        saldoAtual = Integer.valueOf(input.nextLine());
        
        System.out.println("Digite a operação desejada: "
                + "\n 1 - Depósito"
                + "\n 2 - Saque");
        operacao = Integer.valueOf(input.nextLine());
        
        System.out.print("Digite o valor da transação: ");
        valor = Integer.valueOf(input.nextLine());
        
// Processamento de dados
        
        switch (operacao) {
            case 1: novoSaldo = saldoAtual + valor;
            break;
            case 2: novoSaldo = saldoAtual - valor;
            break;
            default: System.out.println("Não Foi escolhido uma opção válida");
        }
        
// Saída de dados
        System.out.println("Seu novo saldo após sua operação é de: R$ " + novoSaldo + ",00");
        
        if (novoSaldo < 0) {
            System.out.println("Conta Estourada");
        }
    }
    
}
