package modelos;

import java.util.ArrayList;

public class Estudiante extends Persona{
    //Informacion del estudiante
    public String matricula;
    public ArrayList<Paralelo> paralelos;

    public Estudiante(String matricula, String nombre, String apellido, int edad, Direccion direccion, Telefono telefono, String facultad) {
        super(nombre, apellido, edad, direccion, telefono, facultad);
        this.matricula = matricula;
        this.paralelos = new ArrayList<>();
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    //Calcula y devuelve la nota  contando examen, deberes, lecciones y talleres. El teorico y el practico se calcula por parcial.
    public double calcularNotas(Paralelo p, double nexamen,double ndeberes, double nlecciones, double ntalleres){
        for(Paralelo par:paralelos){
            if(p.equals(par)){
                double notaTeorico=(nexamen+ndeberes+nlecciones)*0.80;
                double notaPractico=(ntalleres)*0.20;
                return (notaTeorico+notaPractico);
            }
        }
        return 0;
    }
    
    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. Esta nota es solo el promedio de las dos calificaciones anteriores.
    public double CalcularNotaTotal(Paralelo p){
        for(Paralelo par:paralelos){
            if(p.equals(par)){
                return (p.getMateria().getNotaInicial()+p.getMateria().getNotaFinal())/2;
                
            }
        }
        return 0;    
    }
}
        
    
    
    
            
        
        
