/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica04;

/**
 *
 * @author sistemas
 */
public class AdaptadorDrone implements Pato{
    private final Drone drone;
    public AdaptadorDronee (Drone drone){
        this.drone = drone;
    }
    @Override
    public void cuackear(){
        drone.beep();
        
    }
    public void volar(){
        drone.girarRotor();
        drone.despegar();
    }
    
}
