/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista;

import java.time.temporal.JulianFields;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mateus Ferraz
 */
public class Lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Maria");
        lista.add("Mateus");
        lista.add("João");
        lista.add("Marcos");

        lista.add(2, "Julia");

        System.out.println(lista.size());

        for (String x : lista) {
            System.out.println(x);

        }
        lista.remove(1);

        System.out.println("-----------------------------------");
        for (String x : lista) {

            System.out.println(x);
        }
        System.out.println("---------------------");
        lista.removeIf(x -> x.charAt(0) == 'J');
        for (String x : lista) {

            System.out.println(x);
        }
        System.out.println("---------------------");
        System.out.println("Indice do marcos:" + lista.indexOf("Marcos"));
        System.out.println("Indice do bob:" + lista.indexOf("bob"));
        System.out.println("---------------------");
        List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'M').collect(collectors.toLista());

       
        for (String x : resultado) {

            System.out.println(x);
        }
     System.out.println("---------------------");
   String nome=lista.stream().filter(x->x.charAt(0) == 'J').findFirst().orElse(null);
    
    }

}
