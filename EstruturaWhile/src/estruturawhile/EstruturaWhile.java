/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estruturawhile;

import java.util.Scanner;

/**
 *
 * @author Mateus Ferraz
 */
public class EstruturaWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
        System.out.println("Digite um numero ");
         int numero = 0;
         int soma =0;
        numero = sc.nextInt();
       
        while (numero!=0) {
            soma +=numero;
            System.out.println("Digite outro numero ");
        numero=sc.nextInt();
            
        }
        sc.close();
        System.out.println("resultad0 "+soma);
    }
    
}
