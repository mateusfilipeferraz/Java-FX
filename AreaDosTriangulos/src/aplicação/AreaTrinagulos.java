/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicação;

import entities.Triangle;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mateus Ferraz
 */
public class AreaTrinagulos {

    public static void main(String[] args) {
        /* resolvendo o problema sem POO

        Locale.setDefault(Locale.US);
        System.out.println("Digite a medidas do triângulo X ");

        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;
        
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        
        System.out.println("Digite a medidas do triângulo y ");
        
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();
        double maio = 0;
        double px = (xA + xB + xC) / 2;
        double areax = Math.sqrt(px * (px - xA) * (px - xB) * (px - xC));
        
        double py = (yA + yB + yC) / 2.0;
        double areay = Math.sqrt(py * (py - yA) * (py - yB) * (py - yC));

        System.out.printf("A área do triâgulo x é %.4f%n",areax);
        System.out.printf("A área do triâgulo y é %.4f%n",areay);
        if (areax>areay) {
            System.out.println("O triângulo X é maior");
        }else{
            System.out.println("O triângulo Y é maior");
        }
        sc.close();
         */

        //Resolvendo o problema com POO
        
        Locale.setDefault(Locale.US);
        System.out.println("Digite a medidas do triângulo X ");

        Scanner sc = new Scanner(System.in);
        Triangle x,y;
       x=new Triangle();
       y=new Triangle();
        
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite a medidas do triângulo y ");

        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        
        double areax =x.area();

        
        double areay = y.area();

        System.out.printf("A área do triâgulo x é %.4f%n", areax);
        System.out.printf("A área do triâgulo y é %.4f%n", areay);
        if (areax > areay) {
            System.out.println("O triângulo X é maior");
        } else {
            System.out.println("O triângulo Y é maior");
        }
        sc.close();

    }

}
