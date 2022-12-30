/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import entidade.Nota;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mateus Ferraz
 */
public class MediaAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Nota nota = new Nota();

        System.out.println("Programa para Saber se o aluno foi aprovado ");
        System.out.println("");
        System.out.println("Para ser aprovado a aluno necessita de no minimo 60% da nota ");
        System.out.println("");
        System.out.println("Insira o nome do aluno  ");
        nota.nome=sc.nextLine();
        System.out.println("Insira a nota do primeiro trimeste ");
        nota.prime = sc.nextDouble();
        System.out.println("Insira a nota do segundo trimeste ");
        nota.segun = sc.nextDouble();
        System.out.println("Insira a nota do terceiro trimestre");
        nota.terce = sc.nextDouble();
        nota.calculo();
        

    }
}
