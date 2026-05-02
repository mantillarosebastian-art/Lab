/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica04;

/**
 *
 * @author sistemas
 */
public class SuperDrone implements Drone {
    
    @Override
    public void beep() {
        System.out.println("Beep Beep");
    }
    @Override
    public void girarRotor(){
        System.out.println("Rotor girando ");
    }
    @Override
    public void despegar () {
        System.out.println("Dron Despegando ");
    }
    
}
