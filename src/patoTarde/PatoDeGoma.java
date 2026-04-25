/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patoTarde;

/**
 *
 * @author sistemas
 */
public class PatoDeGoma extends Pato implements Cuaqueable, Volable {

    @Override
    public void mostrar() {
        System.out.println("Yo soy un Patito de goma");
    }

    @Override
    public void cuaquear() {
        System.out.println("Chirr Chirr");
    }

    @Override
    public void volar() {
        System.out.println("INCAPAZ DE VOLAR");
    }
}
