/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import Entidade.RetanCalc;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mateus Ferraz
 */
public class  Retangulo {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        RetanCalc retanCalc = new RetanCalc();
       
        System.out.println("Insira o valor da largura do Retângulo:");
        retanCalc.largura =sc.nextDouble();
        
        System.out.println("Insira o valor da altura do Retangulo: ");
        retanCalc.altura=sc.nextDouble();
        
        System.out.println(retanCalc);
        
        sc.close();
        
        
    }    
}
