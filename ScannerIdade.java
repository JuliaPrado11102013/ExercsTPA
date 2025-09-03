/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.scanneridade;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;

public class ScannerIdade {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        int faixa = -1; // Código da faixa etária

        // Determinar a faixa etária com if
        if (idade >= 0 && idade <= 12) {
            faixa = 1; // Criança
        } else if (idade >= 13 && idade <= 17) {
            faixa = 2; // Adolescente
        } else if (idade >= 18 && idade <= 59) {
            faixa = 3; // Adulto
        } else if (idade >= 60) {
            faixa = 4; // Idoso
        }

        // Mostrar resultado com switch
        switch (faixa) {
            case 1 -> System.out.println("Você é uma criança.");
            case 2 -> System.out.println("Você é um adolescente.");
            case 3 -> System.out.println("Você é um adulto.");
            case 4 -> System.out.println("Você é um idoso.");
            default -> System.out.println("Idade inválida.");
        }
    }
}
