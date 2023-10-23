package practica09_menus;

public class Nodo 
{
    private Nodo siguiente;
    private int dato;
    
    public Nodo(int dato, Nodo siguiente)
    {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
}
