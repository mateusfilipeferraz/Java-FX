/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulascnner;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mateus Ferraz
 */
public class AulaScnner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Scanner sc = new Scanner(System.in);
        double  a = sc.nextDouble();
        double b = sc.nextDouble();
        double resultado = a + b;
         System.out.println("O resultado da soma de a mais b e igual " +resultado);
       
        Locale.setDefault(Locale.US);
       System.out.println("Digite o raio:");
        double r,a,pi=3.14159;
         r= sc.nextDouble();
         a=pi*r*r;
         
       
      
         System.out.printf("A=%.4f%n",a); 
        
        
        int a,b,c,d =0;
        System.out.println("Digite o valor de A");
        a=sc.nextInt();
        System.out.println("Digite o valor de B");
        b=sc.nextInt();
        System.out.println("Digite o valor de C");
        c=sc.nextInt();
        System.out.println("Digite o valor de D");
        d=sc.nextInt();
        int diferença = ((a*b)-(c*d));
        
        System.out.println("Diferença= "+diferença);
         */
       
        Scanner sc = new Scanner(System.in);
         Locale.setDefault(Locale.US);
        
        /*int matricula,hora;
        double valorhora,salario;
        System.out.println("Digite sua matrícula");
        matricula=sc.nextInt();
        System.out.println("Digite as horas trabalhadas  ");
        hora=sc.nextInt();
        System.out.println("Digite o valor da hora por hora trabalhada");
        valorhora=sc.nextDouble();

        salario = valorhora*hora;
        System.out.printf("Sua matricula é  " +matricula+
        "\nSeu salario e R$ " + salario);
         
        int cod1, cod2, qt1, qt2;
        double preco1, preco2, total;
        System.out.println("Digite o codigo do produto.");
        cod1 = sc.nextInt();
        System.out.println("Digite a quantidade de produtos. ");
        qt1 = sc.nextInt();
        System.out.println("Digite o valor unitario do produto.");
        preco1 = sc.nextDouble();

        System.out.println("Digite o codigo do produto.");
        cod2 = sc.nextInt();
        System.out.println("Digite a quantidade de produtos. ");
        qt2 = sc.nextInt();
        preco2 = sc.nextDouble();

        total = preco1 * qt1 + preco2 * qt2;
        System.out.printf("Total a pagar: R$ %.2f%n",total );
         */
        double a, b, c, trian, circu, trap, qua, reta;
        System.out.println("Digite o valor de A ");
        a = sc.nextDouble();
        System.out.println("Digite o valor de B ");
        b = sc.nextDouble();
        System.out.println("Digite o valor de C ");
        c = sc.nextDouble();

        trian = a * c / 2.0;
        circu = 3.14159 * c * c;
        trap = (a + b) * c/2;
        qua = b * b;
        reta = a * b;
        System.out.printf("Triangulo %.3f%n:" , trian);
        System.out.printf("Circulo  %.3f%n:" ,circu);
        System.out.printf("Trapezio  %.3f%n:" , trap);
        System.out.printf("Quadrado  %.3f%n:" , qua);
        System.out.printf("retangulo  %.3f%n:" , reta);
        sc.close();

    }

}
