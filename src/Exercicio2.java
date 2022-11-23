/*
Crie um programa que leia a idade de uma pessoa expressa em anos, meses e dias
e mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias. Use a classe Scanner
para fazer a leitura de dados e pode considerar que o usuário sempre vai digitar corretamente um número inteiro.
*/

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[]args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite sua idade em anos:");
        var ano = leitura.nextInt();

        System.out.println("Digite sua idade em meses:");
        var mes = leitura.nextInt();

        System.out.println("Digite sua idade em dias:");
        var dia = leitura.nextInt();

        int idadeEmDias = dia + (ano * 365) + (mes * 30);
        System.out.println("Sua idade em dias é de: " + idadeEmDias);
    }
}
