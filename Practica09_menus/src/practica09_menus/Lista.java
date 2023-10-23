package practica09_menus;

import javax.swing.JOptionPane;

public class Lista 
{
    private Nodo inicio, ultimo;
    
    public Lista ()
    {
        inicio = null;
        ultimo = null;
    }
    
    public boolean isEmpty()
    {
        if(inicio == null)
            return true;
        return false;
    }
    
    public void push(int dato)
    {
        Nodo nuevo = null;
        
        if(isEmpty())
        {
            firstInput(nuevo, dato);
        }
        else
        {
            nuevo = new Nodo(dato, inicio);
            inicio = nuevo;
            JOptionPane.showMessageDialog(null, "Se ha agregado el elemento a la lista");
        }
    }
    
    public void pop()
    {
        int dato;
        
        if(isEmpty())
        {
            //JOptionPane.showMessageDialog(null, "La pila esta vacia");
            JOptionPane.showMessageDialog(null, "La pila esta vacia","Informativa",
                JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            if(inicio == ultimo)
            {
                inicio = null;
                ultimo = null;
                JOptionPane.showMessageDialog(null, "La pila ha quedado vacia");
            }
            else
            {
                dato = inicio.getDato();
                inicio = inicio.getSiguiente();
                JOptionPane.showMessageDialog(null, "Se ha eliminado el elemento "+dato+" de la pila");
            }
        }
    }
    
    public void desencolar()
    {
        int dato;
        
        if(isEmpty())
        {
            JOptionPane.showMessageDialog(null, "La cola esta vacia", "Informativa",
                    JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            if(inicio == ultimo)
            {
                JOptionPane.showMessageDialog(null, "La cola ha quedado vacia");
                inicio = null;
                ultimo = null;
            }
            else
            {
                Nodo walker = inicio;
                
                System.out.println("walker = "+walker.getDato());
                System.out.println("Ultimo = "+ultimo.getDato());
                
                while(walker.getSiguiente() != ultimo)
                {
                    walker = walker.getSiguiente();
                }
                
                dato = ultimo.getDato();
                walker.setSiguiente(null);
                ultimo = walker;
                JOptionPane.showMessageDialog(null, "Se ha eliminado el elemento "+dato+ " de la cola");
                
            }
        }
    }
    
    public String displayData()
    {
        Nodo walker;
        String datos = "";
        
        if(isEmpty())
        {
            datos = "Esta vacia la ";
            return datos;
        }
        
        walker = inicio;
        
        while( walker != null)
        {
            datos += String.valueOf(walker.getDato()) +" ";
            walker = walker.getSiguiente();
        }
        return datos;
    }
    
    public void firstInput(Nodo nuevo, int dato)
    {
        nuevo = new Nodo(dato, null);
        inicio = nuevo;
        ultimo = inicio;
        JOptionPane.showMessageDialog(null, "Se ha agregado el primer elemento a la lista");
    }
    
}
