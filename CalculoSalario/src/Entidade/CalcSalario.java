/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidade;

/**
 *
 * @author Mateus Ferraz
 */
public class CalcSalario {

    public String nome;
    public double salario;
    public double taxa;
    public double aumento;

//cauculo salário menos ataxa 
    
    public double taxa() {
        return this.salario - taxa;
    }

    public String toString() {
        return nome + String.format(" Salario:%.2f " , taxa()) + "R$";
    }
    
    // cauculo aumeneto do salário 
    
 public double addaumento() {
       return ((salario * aumento) / 100.00) + taxa();
       

    }

    public String calculoString() {
        return String.format("O salário do funcionário",nome)+"aumentou para " +addaumento();
    
    }
        
}
