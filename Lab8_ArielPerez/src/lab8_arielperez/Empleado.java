package lab8_arielperez;

import java.util.ArrayList;

public class Empleado {

    Object padre;
    ArrayList<Empleado> hijos = new ArrayList();
    String nombre;

    public Empleado() {
    }

    public Empleado(Object padre, String nombre) {
        this.padre = padre;
        this.nombre = nombre;
    }

    public Object getPadre() {
        return padre;
    }

    public void setPadre(Object padre) {
        this.padre = padre;
    }

    public ArrayList<Empleado> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<Empleado> hijos) {
        this.hijos = hijos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    


    @Override
    public String toString() {
        return nombre;
    }

}//fin de la clase

