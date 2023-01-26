/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculo;

/**
 *
 * @author Mateus Ferraz
 */
public class ConversoMoeda {

    public double dolar;
    public double quantidade;

    public double valor() {
        return dolar * quantidade;

    }
public double calcimposto(){
return valor()*6/100+valor();
}
}
