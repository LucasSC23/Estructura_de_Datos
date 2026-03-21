/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appacademico;

/**
 *
 * @author FPUNA
 */
public class MateriaAlumno extends Materia {
    private int nota;

    /**
     *
     * @param codigo
     * @param nombre
     * @param nota
     */
    public MateriaAlumno(int codigo, String nombre, int nota) {
        super(codigo, nombre);
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "MateriaAlumno{" + super.toString()+ "nota=" + nota + '}';
    }
    
    
}
