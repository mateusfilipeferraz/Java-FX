/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package opercaosplit;

/**
 *
 * @author Mateus Ferraz
 */
public class OpercaoSplit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String s = " potato apple lemon ";

        String[] vect = s.split(" ");
        
        String Word1 = vect[1];
        String Word2 = vect[2];
        String Word3 = vect[3];
        
        System.out.println(Word1);
        System.out.println(Word2);
        System.out.println(Word3);
    }

}
