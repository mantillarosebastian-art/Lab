/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica04;

public class Practica04 {

    public static void main(String[] args) {

        Pato pato = new PatoReal();
        Pavo Pavo = new PavoSilvestre();

        Pato adaptadorPavo = new AdaptadorPavo(Pavo);

        System.out.println("El pavo hace...");
        Pavo.gluglutear();
        Pavo.volar();

        System.out.println("\nEl pato hace...");
        pato.cuackear();
        pato.volar();

        System.out.println("\nEl adaptador pavo hace...");
        adaptadorPavo.cuackear();
        adaptadorPavo.volar();
    }

    static void testPato(Pato pato) {
        pato.cuackear();
        pato.volar();
    }
}
