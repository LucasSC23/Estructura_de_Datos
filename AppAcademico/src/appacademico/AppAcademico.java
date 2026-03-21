/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appacademico;

/**
 *
 * @author FPUNA
 */
public class AppAcademico {
    Profesor [] profes;
    Alumno [] alumnos;
    
    
    
    public AppAcademico() {
        Materia[]mats = new Materia[5];
        mats[0] = new Materia(123,"Estructura de Datos");
        mats[0] = new Materia(124,"Estructura de lenguajes");
        
        profes = new Profesor[3];
        profes[0] = new Profesor(123456,"Juan","Acosta","Informatica"
            ,mats,"NA");
        
        for (Profesor profe : profes) {//clase=Profesor, Variable en la que guardamos para impresión= profe, Vector= profes
            System.out.println(profe);
            
        }
        
        
        System.out.println("---Alumno---");
      
        MateriaAlumno[] matsAlumno = new MateriaAlumno[5];
        matsAlumno[0]= new MateriaAlumno(123, "Estructura de Datos", 5);
        matsAlumno[1]= new MateriaAlumno(123, "Estructura de lenguajes", 5);
        matsAlumno[2]= new MateriaAlumno(123, "Matematicas", 5);
        matsAlumno[3]= new MateriaAlumno(123, "Administracion", 5);
        matsAlumno[4]= new MateriaAlumno(123, "Informatica", 5);
        
        alumnos = new Alumno[4];
        alumnos[0]=new Alumno(123,"Juan","Perez");
        alumnos[1]=new Alumno(123,"Juan","Perez", matsAlumno);
        
        
        System.out.println("Esta aplazado"+alumnos[1].estaAplazado());
        System.out.println("Promedio"+alumnos[1].calcularPromedio());
        alumnos[1].darExamen(123);
        System.out.println("To String"+alumnos[1].toString());
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
    }
    
}
