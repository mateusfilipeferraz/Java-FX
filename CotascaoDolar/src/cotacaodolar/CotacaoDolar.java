/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cotacaodolar;

import Calculo.ConversoMoeda;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mateus Ferraz
 */

public class CotacaoDolar {

    public static void main(String[] args) {
        ConversoMoeda conversoMoeda = new ConversoMoeda();
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite acotação atual do dóla:");
      conversoMoeda.dolar = sc.nextDouble();
        System.out.println("Quantos dólares quer comprar?");
     conversoMoeda.quantidade = sc.nextDouble();
        System.out.printf("O total de sua compra é %.2f%n",conversoMoeda.calcimposto()," reais já acrescido do imposto" );

    }

}
