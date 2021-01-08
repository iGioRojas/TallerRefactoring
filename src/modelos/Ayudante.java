package modelos;

import java.util.ArrayList;

public class Ayudante extends Estudiante {
    
    private ArrayList<Paralelo> paralelosAyudante;

    public Ayudante(String matricula, String nombre, String apellido, int edad, Direccion direccion, Telefono telefono, String facultad) {
        super(matricula,nombre, apellido, edad, direccion, telefono, facultad);

        this.paralelosAyudante = new ArrayList<>();
    }
    //Los paralelos se añaden/eliminan directamente del Arraylist de paralelos

    //Método para imprimir los paralelos que tiene asignados como ayudante
    public void MostrarParalelos(){
        for(Paralelo par:paralelosAyudante){
            //Muestra la info general de cada paralelo
        }
    }
}
