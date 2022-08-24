/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repetiçãofor;

/**
 *
 * @author Mateus Ferraz
 */
public class RepetiçãoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        for (int i=0; i<=15;i+=2) {
            if (i%3==0) 
                continue;   
         System.out.println(i);
            
        }
         
    }
    
}
