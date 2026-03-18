/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

import practica1.Persona;

/**
 *
 * @author FPUNA
 */
public abstract class Empleado extends Persona {//subclase que herede= programador, gerente etc
    private int sueldo;
    private String dpto;//Departamento al que pertenece
    public static final int SALARIO_MINIMO=3000000;//Final es una cte, variable de la clase al agregarle static
    
    public abstract int calcularSalario();

    
    //sobrecarga de metodos
    public Empleado() {
    }

    public Empleado(int cedula, String nom, byte edad, int sal) {
        super(cedula, nom, edad);
        sueldo= sal;
        dpto="Ventas";
        
    }

    public Empleado(int ci, String nombre, byte edad, String telefono,
            int sal, String dep) {
        super(ci, nombre, edad, telefono);
        sueldo = sal;
        dpto = dep;
    }

   
    
    /**
    public Empleados(){//
        super()se va al constructor que no tiene parametro
    }
    **/
    
    
    
    public int getSueldo() {
        return sueldo;
    }
    
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }
    
    //sobreescribir significa cambiar el comportamiento del metodo 

    @Override
    public String toString() {
        return "Empleado{" + super.toString() + "sueldo=" + sueldo + ", dpto=" + dpto + '}';//con super llamamos al metodo en a super clase
    }
    
    
    
}
