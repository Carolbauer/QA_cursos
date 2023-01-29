package br.com.dio.debbuging;

import java.util.Scanner;

public class CalculadoradeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Caroline", "Tiago", "Leticia", "Ariana" };

        double media = calculaMediaTurma(alunos, scan);

        System.out.printf("A média da turma %.1f: ", media);
    }

    public static Double calculaMediaTurma(String[] alunos, Scanner scanner) {
        double soma = 0;
        for (String aluno : alunos) {
            System.out.printf("Nota do aluna %s: ", aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }
        return soma/alunos.length;
    }
}

