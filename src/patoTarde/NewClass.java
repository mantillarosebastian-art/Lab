/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patoTarde;

/**
 *
 * @author sistemas
 */
public class NewClass {
    public static void main(String[] args) {
        //PatoReal
        PatoReal p1 = new PatoReal();
        System.out.print("\n");
        p1.mostrar();
        p1.cuaquear();
        p1.volar();
        p1.nadar();
        
        //Pato de goma
        PatoDeGoma p2 = new PatoDeGoma();
        System.out.print("\n");
        p2.mostrar();
        p2.cuaquear();
        p2.volar();
        p2.nadar();
        
        //Pato Señuelo
        System.out.print("\n");
        PatoSenuelo p3 = new PatoSenuelo();
        p3.mostrar();
        p3.cuaquear();
        p3.volar();
        p3.nadar();
        
        //Pato Cabeza Roja
        System.out.print("\n");
        PatoCabezaRoja p4 = new PatoCabezaRoja();
        p4.mostrar();
        p4.cuaquear();
        p4.volar();
        p4.nadar();
    }
}
