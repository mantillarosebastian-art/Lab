
package pato;
public class Pato {

    public static void main(String[] args) {

        PatoReal pato1 = new PatoReal();
        pato1.mostrar();
        pato1.cuackear();
        pato1.volar();
        pato1.nadar();

        PatoDeGoma pato2 = new PatoDeGoma();
        pato2.mostrar();
        pato2.cuackear();
        System.out.println("INCAPAZ DE VOLAR");
        pato2.nadar();

        Pat pato3 = new PatoSenuelo();
        pato3.mostrar();
        System.out.println("<< Silencio >>");
        System.out.println("INCAPAZ DE VOLAR");
        pato3.nadar();
        
       PatoCabezaRoja pato4 = new PatoCabezaRoja();
        pato4.mostrar();
        pato4.cuackear();
        pato4.volar();
        pato4.nadar();
    }
}
