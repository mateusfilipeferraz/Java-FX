/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package resolucaoexercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mateus Ferraz
 */
public class ResolucaoExercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Farei todos execicios em um unico programa e marcarei como comentario para 
        posteriormente ir testando.
        para usar o programa desmarque-o do comentario.        
         */

 /*
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar?");
     
      int n =sc.nextInt();
      
     int [] vet=new int[n];
        for (int i = 0; i <n; i++) {
            System.out.print("Digite um numero:");
            vet[i]=sc.nextInt();
        }
        System.out.println("Numeros negativo ");
        for (int i = 0; i <n; i++) {
            if (vet[i]<0) {
                System.out.println(vet[i]);
            }
            
        }
        
      sc.close();
         
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n;
        double soma, media;

        System.out.print("Quantos números quer digitar?");
        n = sc.nextInt();

        double[] vet = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vet[i] = sc.nextDouble();
        }
        soma = 0;
        for (int i = 0; i<n; i++) {
            soma = soma + vet[i];
        }

        media = soma / n;
        System.out.print("Valores= ");

        for (int i = 0; i < n; i++) {
            System.out.printf("%.0f ", vet[i]);
        }

        System.out.printf("\nSOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f\n", media);

        sc.close();

         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quanta pessoas serão digitadas?");
        int n = sc.nextInt();
        String[] nome = new String[n];
        int[] idades = new int[n];
        double[] altura = new double[n];
        
        
        for (int i = 0; i <n; i++) {
            System.out.println("Dados da " +(i+1)+" a pessoa");
            System.out.print("Nome:");
           nome[i] =sc.next();
            System.out.print("Idade:");
          idades[i]=sc.nextInt();
            System.out.print("Altura:");
          altura [i]=sc.nextDouble();
        }
        double soma=0;
        for (int i = 0; i <n; i++) {
            soma=soma+altura[i];
        }
        
double mediaaltura=soma/n;
       
        int cont=0;
        for (int i = 0; i <n; i++) {
            if (idades[i]<16) {
             cont=cont+1;
                
            }
           
        }
        
         double menor = cont*100.0/n;
        System.out.printf("Altura média: %.2f%n", mediaaltura);
        System.out.printf("pessoas com menos de 16 anos: %.1f%%%n",menor );
       
        for (int i = 0; i <n; i++) {
            if (idades[i]<16) {
                 System.out.println(nome[i]);
            }
            
        }
        sc.close();
    }

}
