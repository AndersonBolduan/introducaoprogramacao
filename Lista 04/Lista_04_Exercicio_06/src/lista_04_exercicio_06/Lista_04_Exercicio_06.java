/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista_04_exercicio_06;

import java.util.Scanner;

/**
 *
 * @author ander
 */
public class Lista_04_Exercicio_06 {

    static Scanner input = new Scanner (System.in);
    
    public static void main(String[] args) {
// Variáveis
        
        String nome;
        int nota;
        
// Entrada de dados

        System.out.print("Digite o nome do aluno: ");
        nome = input.nextLine();
        
        System.out.print("Digite a nota do aluno: ");
        nota = Integer.valueOf(input.nextLine());
        
// Processamento de Dados

        verificaConceitoDoAluno(nome, nota);
    }
    
    public static void verificaConceitoDoAluno (String nome, int nota) {
        
        if (nota <= 49) {
            System.out.println("O aluno " + nome + " está com nota: "
                    + nota + ", por tanto, o conceito é INSUFICIENTE");
        }else if (nota <= 64) {
            
            System.out.println("O aluno " + nome + " está com nota: "
                    + nota + ", por tanto, o conceito é REGULAR");
        } else if (nota <= 84) {
            System.out.println("O aluno " + nome + " está com nota: "
                    + nota + ", por tanto, o conceito é BOM");
        } else {
            System.out.println("O aluno " + nome + " está com nota: "
                    + nota + ", por tanto, o conceito é ÓTIMO");
        }
    }
}
