/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mateus Ferraz
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i <mat.length; i++) {
            for (int j = 0; j <mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.print("Main diagonal:");
        for (int i = 0; i <mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println("");
        int cont =0;
         for (int i = 0; i <mat.length; i++) {
             for (int j = 0; j <mat[i].length; j++) {
                 if (mat[i] [j] < 0) {
                     cont++;
                 }
             }
        }
        System.out.println("negative number:"+cont);
 
        sc.close();
    }
}
