/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

/**
 *
 * @author FPUNA
 */
public  class Programador extends Empleado {
    private String lenguaje;
    private int bonif;
    
    public Programador() {
        
    }

    public Programador(int ci, String nombre, byte edad, String telefono, 
            int sal, String dep, int bonif) {
        super(ci, nombre, edad, telefono, sal, dep);
        bonificacion = bonif;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }


    public int getBonif() {
        return bonif;
    }

    public void setBonif(int bonif) {
        this.bonif = bonif;
    }

    @Override
    public String toString() {
        return "Programador{" +super.toString() "lenguaje=" + lenguaje + ", sueldo=" + sueldo + '}';
    }

    @Override
    public int calcularSalario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
