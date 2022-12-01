/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maiornumero;

import java.util.Scanner;

/**
 *
 * @author Mateus Ferraz
 */
public class Maiornumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // código para ler o maior numero 
        System.out.println("digite 3 numeros");

        System.out.println("Digite o primeiro número");
        Scanner sc = new Scanner(System.in);

        double num1 = sc.nextDouble();

        System.out.println("Digite o segundo número ");

        double num2 = sc.nextDouble();

        System.out.println("Digite o terceiro número");

        double num3 = sc.nextDouble();
        if (num1 > num2 && num1 > num3) {
            System.out.println("Maior número é " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Maior número é " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("Maior número é " + num3);
        }
        sc.close();
    }

}
