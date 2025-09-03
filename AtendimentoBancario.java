/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atendimentobancario;


 import java.util.Scanner;

public class AtendimentoBancario {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double saldo = 1000.0; // Saldo inicial fictício
            int opcao;
            
            do {
                System.out.println("=== BANCO MONTENEGRO ===");
                System.out.println("1 - Consultar saldo");
                System.out.println("2 - Sacar dinheiro");
                System.out.println("3 - Depositar dinheiro");
                System.out.println("4 - Encerrar atendimento");
                System.out.print("Escolha uma opção: ");
                
                opcao = scanner.nextInt();
                
                switch (opcao) {
                    case 1 -> System.out.printf("Seu saldo atual é: R$ %.2f\n", saldo);
                    case 2 -> {
                        System.out.print("Digite o valor para saque: R$ ");
                        double saque = scanner.nextDouble();
                        if (saque <= saldo) {
                            saldo -= saque;
                            System.out.printf("Saque realizado com sucesso! Novo saldo: R$ %.2f\n", saldo);
                        } else {
                            System.out.println("Erro: Saldo insuficiente.");
                        }
                    }
                    case 3 -> {
                        System.out.print("Digite o valor para depósito: R$ ");
                        double deposito = scanner.nextDouble();
                        if (deposito > 0) {
                            saldo += deposito;
                            System.out.printf("Depósito realizado com sucesso! Novo saldo: R$ %.2f\n", saldo);
                        } else {
                            System.out.println("Erro: Valor de depósito inválido.");
                        }
                    }
                    case 4 -> System.out.println("Atendimento encerrado. Obrigado por utilizar nosso banco!");
                    default -> System.out.println("Operação inválida. Por favor, escolha uma opção entre 1 e 4.");
                }
                
            } while (opcao != 4);
        } // Saldo inicial fictício
    }
}
