/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.frutabananamacaperablueberry;
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class FrutaBananaMacaPeraBlueberry {

    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    System.out.println("Escolha sua fruta, eba! De 1 a 4:");
     if (scanner.hasNextInt()) {
    int numero = scanner.nextInt();
    switch (numero){
        case 1 -> System.out.println("Maçã");
        case 2 -> System.out.println("Pera");
        case 3 -> System.out.println("Banana");
        case 4 -> System.out.println("BlueBerry");
        default -> System.out.println("Fruta inválida! Escolha de 1 a 4!");
        
             }
        } else {
            System.out.println("Eita! Entrada inválida! Tem que ser um número de 1 a 4.");
    }
     
        scanner.close();
    }
}
