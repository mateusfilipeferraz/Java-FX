/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author Mateus Ferraz
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        System.out.print("Quantas pernas ?");
        String tipo;
        int perna = tec.nextInt();
        System.out.println("Isso e um(a)");
        switch (perna) {

            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 4:
                tipo = "Quadruped";
                break;
            case 6,8:
                tipo = "Aranha";
                break;
            default:
                tipo = "Et";
              
            
        }
       System.out.println(tipo);
    }

}
