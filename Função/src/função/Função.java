/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package função;

import java.util.Scanner;

/**
 *
 * @author Mateus Ferraz
 */
public class Função {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Digite 3 valores:");
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int higher = max(a,b,c); 
        
        showResut(higher);
        
        sc.close();
        
    }

    private static int max(int a, int b, int c) {
           
       int aux;
        if (a>b &&a>c) {
            aux=a;   
        }else if (b>a&&b>c){
            aux=b;
        }else{
            aux=c;
        }
        return aux;
    }

    private static void showResut(int higher) {
        System.out.println("higher= "+higher);
    }
    
    
}
