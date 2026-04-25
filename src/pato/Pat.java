
package pato;
public abstract class Pat {
    protected Volable volable;
    protected Cuakeable cuaqueable;

    public void realizarVuelo() {
        volable.volar();
    }

    public void realizarCuaqueo() {
        cuaqueable.cuackear();
    }

    public void nadar() {
        System.out.println("Todos los patos flotan, incluso los de goma");
    }

    public abstract void mostrar();
}