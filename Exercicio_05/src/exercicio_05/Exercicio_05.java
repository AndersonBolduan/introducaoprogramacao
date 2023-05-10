/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio_05;

import java.util.Scanner;

/*
 *
 * @author ander
 */
public class Exercicio_05 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
// Variáveis

        int idade, menorIdade = 0, alunos = 1, contIdade = 0, contAltura = 0;
        float altura, mediaIdade = 0, mediaAltura = 0;

        while (alunos <= 5) {
            System.out.print("Digite a idade do aluno: ");
            idade = Integer.valueOf(input.nextLine());
            System.out.print("Digite a altura do aluno: ");
            altura = Float.valueOf(input.nextLine());

            menorIdade = calculoDeAlunosMenor18(idade, menorIdade);

            if (altura < 1.7) {
                contIdade++;
                mediaIdade = (mediaIdade + idade) / contIdade;
            }

            if (idade > 20) {
                contAltura++;
                mediaAltura = (mediaAltura + altura) / contAltura;
            }

            System.out.println("Tem " + menorIdade + " alunos menor de 18");
            System.out.println("A idade média de alunos com menos de 1,70m é de: " + mediaIdade);
            System.out.println("A altura média de alunos com mais de 20 anos é de: " + mediaAltura);
            alunos++;
        }
    }

    public static int calculoDeAlunosMenor18(int idade, int menorIdade) {
        if (idade < 18) {
            menorIdade++;
        }

        return menorIdade;
    }

}
