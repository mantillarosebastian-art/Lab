
package pato;
public class Pato {

    public static void main(String[] args) {

        PatoReal pato1 = new PatoReal();
        pato1.mostrar();
        pato1.cuackear();
        ((PatoReal)pato1).volar();
        pato1.nadar();

        Pat pato2 = new PatoDeGoma();
        pato2.mostrar();
        ((PatoDeGoma)pato2).cuackear();
        System.out.println("INCAPAZ DE VOLAR");
        pato2.nadar();

        Pat pato3 = new PatoSenuelo();
        pato3.mostrar();
        System.out.println("<< Silencio >>");
        System.out.println("INCAPAZ DE VOLAR");
        pato3.nadar();
        
        Pat pato4 = new PatoCabezaRoja();
        pato4.mostrar();
        ((PatoCabezaRoja)pato4).cuackear();
        ((PatoCabezaRoja)pato4).volar();
        pato4.nadar();
    }
}
