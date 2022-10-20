/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadecurso;

import java.util.Locale;

/**
 *
 * @author Mateus Ferraz
 */
public class AtividadeCurso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
       
       String product1= "computer";
       String product2 = "office desk";
       
       int age=30;
       int code= 5290;
       char gender ='F';
       
      double price1= 2100.0;
      double price2= 650.50;
      double measure = 53.234567;
      
        System.out.println("Product");
        System.out.printf(" %s e");
        System.out.println( "Record: " + age + " years old,code " + code+  " and gender: " + gender );
         System.out.printf("Measue with eigt decimal: %.8f%n",  measure );
     
    }
    
}
