package modelos;

import java.util.ArrayList;

public class Ayudante extends Estudiante {
    protected Estudiante est;
    private ArrayList<Paralelo> paralelosAyudante;

    public Ayudante(Estudiante est) {
        super(est.matricula, est.nombre, est.getApellido(), est.getEdad(), est.getDireccion(), est.getTelefono(), est.getFacultad());
        this.est = est;
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
