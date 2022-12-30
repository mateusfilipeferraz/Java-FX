/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package App;

import Entidade.CalcSalario;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mateus Ferraz
 */
public class Funcionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        CalcSalario calcSalario= new CalcSalario();
        
        System.out.println("Insira o nome do funcionário:");

        calcSalario.nome = sc.nextLine();

        System.out.println("Insira o salario do funcionário:");

        calcSalario.salario = sc.nextDouble();

        System.out.println("Insira a taxa de imposto:");

        calcSalario.taxa = sc.nextDouble();
        
        System.out.println("Nome Funcionário: "+calcSalario);
        
        System.out.println("");
        
        System.out.println("Digite o aumento que quer enserir:");
        calcSalario.aumento=sc.nextDouble();
        
        System.out.println(calcSalario.calculoString());
        sc.close();
    }

}
