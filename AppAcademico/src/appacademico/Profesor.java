/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appacademico;

/**
 *
 * @author FPUNA
 */
public class Profesor extends Persona {
    private String departamento;
    private Materia[] materias;
    private String seccion;

    public Profesor(int cedula, String nombre, String apellido, String departamento, Materia[] materias, String seccion) {
        super(cedula, nombre, apellido);
        this.departamento = departamento;
        this.materias = materias;
        this.seccion = seccion;
    }


    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Materia[] getMaterias() {
        return materias;
    }

    public void setMaterias(Materia[] materias) {
        this.materias = materias;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        StringBuilder mats = new StringBuilder();
        for (Materia mat : materias) {
            mats.append(mat.toString());
            mats.append("\n");
        }
        return "Profesor{" + super.toString() + //con el super to string traemos 
                "departamento=" + departamento +
                ", materias=" + mats + ", seccion=" + seccion + '}';
    }

    @Override
    public String leer(String libro) {
        return "Profesor leyendo el nuevo material" + libro;
    }
    
    
    
    
    
}
