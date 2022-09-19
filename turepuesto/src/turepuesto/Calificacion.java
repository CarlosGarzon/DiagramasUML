package turepuesto;

public class Calificacion {

    private int valor;
    private String descripcion;
    Actor autor;


    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Actor getAutor() {
        return autor;
    }

    public void setAutor(Actor autor) {
        this.autor = autor;
    }
}
