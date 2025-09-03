/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.passagensparaargentina;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;
public class PassagensParaArgentina {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o meio de transporte para Argentina:");
        System.out.println("1 - Ônibus");
        System.out.println("2 - Trem");
        System.out.println("3 - Carro");
        System.out.println("4 - Ônibus rodoviário");
        System.out.print("Digite a opção (1-4): ");
        String entrada = scanner.nextLine();

        int opcao;

        try {
            opcao = Integer.parseInt(entrada);
        } catch (NumberFormatException e) {
            System.out.println("Opção inválida! (Entrada não numérica)");
            scanner.close();
            return;
        }

        double preco;

        switch (opcao) {
            case 1 -> {
                preco = 10.5;
                System.out.println("Você escolheu Ônibus. Preço da passagem: R$ " + preco);
            }
            case 2 -> {
                preco = 12.5;
                System.out.println("Você escolheu Trem. Preço da passagem: R$ " + preco);
            }
            case 3 -> {
                preco = 19.35;
                System.out.println("Você escolheu Carro. Preço da passagem: R$ " + preco);
            }
            case 4 -> {
                preco = 25.5;
                System.out.println("Você escolheu Ônibus rodoviário. Preço da passagem: R$ " + preco);
            }
            default -> {
                System.out.println("Opção inválida! (Número fora do intervalo)");
                scanner.close();
                return;
            }
        }

        // Nova pergunta: Quantas passagens?
        System.out.print("\nQuantas passagens você deseja comprar? ");
        String qtdEntrada = scanner.nextLine();
        int quantidade;

        try {
            quantidade = Integer.parseInt(qtdEntrada);
            if (quantidade <= 0) {
                System.out.println("Quantidade inválida! Deve ser maior que zero.");
                scanner.close();
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Quantidade inválida! Digite um número inteiro.");
            scanner.close();
            return;
        }

        double total = preco * quantidade;
        System.out.printf("Total a pagar por %d passagens: R$ %.2f\n", quantidade, total);

        scanner.close();
    }
}