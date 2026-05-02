
package practica04;

public class AdaptadorPavo implements Pato{
private final Pavo  pavo;
public AdaptadorPavo (Pavo pavo){
    this.pavo=pavo;
}
@Override
public void cuackear(){
    pavo.gluglutear();
} 
@Override
public void volar () {
    pavo.volar();
    
}

}
