package modelos;

import java.util.ArrayList;

public class Profesor extends Persona{
    public String codigo;
    public double BonoFijo;
    public int aniosdeTrabajo;
    public ArrayList<Paralelo> paralelos;
 
    public Profesor(String codigo, String nombre, String apellido, String facultad, int edad, Direccion direccion, Telefono telefono) {
        super(nombre,apellido,edad,direccion,telefono,facultad);
        this.codigo = codigo;
        paralelos= new ArrayList<>();
    }
    
    public void anadirParalelos(Paralelo p){
        paralelos.add(p);
    }
    public double calcularSueldo(){
        return aniosdeTrabajo*600 + BonoFijo;
    }

}
