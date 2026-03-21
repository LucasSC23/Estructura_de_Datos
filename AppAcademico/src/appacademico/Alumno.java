/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appacademico;

/**
 *
 * @author FPUNA
 */
public class Alumno extends Persona{
    private MateriaAlumno[] materias;//Por buenas practicas no se coloca la longitud exacta, en la app es donde definimos eso
    private Materia[] materia;

    public Alumno(int cedula, String nombre, String apellido) {
        super(cedula, nombre, apellido);
        this.materias = materias;
    }

    public Alumno(int cedula, String nombre, String apellido, MateriaAlumno[] materias) {
        super(cedula, nombre, apellido);
        this.materias = materias;
    }

    public MateriaAlumno[] getMaterias() {
        return materias;
    }

    public void setMaterias(MateriaAlumno[] materias) {
        this.materias = materias;
    }

    public Materia[] getMateria() {
        return materia;
    }

    public void setMateria(Materia[] materia) {
        this.materia = materia;
    }
    
        //Implementamos metodo leer
    @Override
    public String leer(String libro) {
        return "El alumno esta leyendo el nuevo libro propuesto" + libro;
    }

    public int calcularPromedio(){
        int promedio=0;
        for (int i = 0; i < materias.length; i++) {
            promedio +=materias[i].getNota();
            
        }
        promedio= promedio/materias.length;
        return promedio;
    }
    
    public boolean estaAplazado(){
        boolean aplazado = false;
        for (int i = 0; i < materias.length; i++) {
            
            if(materias[i].getNota()<2){
                aplazado=true;
            }
        }
        return aplazado ;
    }
    public void darExamen(int mat){
        int nota= 1+ (int)(Math.random()*5);//casteo
        for (int i = 0; i < materias.length; i++) {
            if(materias[i].getCodigo()== mat){
                materias[i].setNota(nota);
            }
            
        }
        
        
    }

    @Override
    public String toString() {
        StringBuilder mats = new StringBuilder();
        for (MateriaAlumno materia1 : materias) {
            mats.append(materia1.toString());
            mats.append("\n");
            
            
        }
        return "Alumno{" + super.toString() + "materias=" + mats.toString() + '}';
    }
    
    
    
    
  
    
    
    
    
}
