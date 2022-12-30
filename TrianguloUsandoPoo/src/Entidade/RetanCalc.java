/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidade;

/**
 *
 * @author Mateus Ferraz
 */
public class RetanCalc {

    public double largura;
    public double altura;

    public double area() {
        return largura * altura;
    }

    public double peri() {
        return (largura + altura) * 2;
    }

    public double diam() {
        return Math.sqrt((altura * altura) + (largura * largura));

    }

    public String toString() {
        return String.format(" Area = %.2f%n ", area())
                + String.format("Perimetro = %.2f%n ", peri())
                + String.format("Diametro = %.2f%n ", diam());
    }

}
