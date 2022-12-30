/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

/**
 *
 * @author Mateus Ferraz
 */
public class Nota {

    public String nome;
    public double prime;
    public double segun;
    public double terce;
    public double nota;

    public float calculo() {
        if (prime <= 30 && segun <= 35 && terce < 35) {
            nota = prime + segun + terce;
        } else {
            System.out.println("Invalido");
        }
        if (nota >= 60) {
            System.out.printf("Nota final: %.2f ", nota);
            System.out.println("Aprovado");

        }
        else {
            double nota1 = 60 - nota;
            System.out.printf("Reprovado %.2f ", nota);
            System.out.printf("faltoul:%.2f ", nota1 , " pontos ");

            return 0;
        }
        return 0;

    }

}
