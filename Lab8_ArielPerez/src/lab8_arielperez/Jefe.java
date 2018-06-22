/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_arielperez;

import java.util.ArrayList;

/**
 *
 * @author ariel
 */
public class Jefe {
    
    String nombre;
    ArrayList<Empleado> jefes = new ArrayList();

    public Jefe() {
    }

    public Jefe(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getJefes() {
        return jefes;
    }

    public void setJefes(ArrayList<Empleado> jefes) {
        this.jefes = jefes;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    

}//fin de la clase
