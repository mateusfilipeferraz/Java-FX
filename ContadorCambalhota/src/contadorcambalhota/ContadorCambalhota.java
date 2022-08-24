/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contadorcambalhota;

import java.util.Scanner;

/**
 *
 * @author Mateus Ferraz
 */
public class ContadorCambalhota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* TODO code application logic here
        int cc = 0;
        while (cc <= 10) {
            cc++;
            if (cc==2 || cc==3|| cc==4) {
                continue;
                
            }
            System.out.println("Cambalhota " + cc);

        }

    
         
        int i = 1;
        int a = 0;
        while (i<10) {
            ++a;
            i=i+1;
            if (a>6)  ++i;
                
            }
        System.out.println("i " +i);
        System.out.println("a " +a);

       int cc = 0;
       do {
           System.out.println("Cambalhota "+ cc);
            cc++;
        } while (cc<=4);
         */
        int n,s = 0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Digite um numero:");
            n = teclado.nextInt();
            s += n;//s=s=n;
            System.out.println("Quer continuar? [S/N]");
            resp = teclado.next();
        } while (resp.equals("s"));
        System.out.println("A soma de todos os valores é "+ s);

    }

    
}
