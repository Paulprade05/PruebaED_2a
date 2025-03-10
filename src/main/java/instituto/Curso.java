/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instituto;

import java.util.TreeSet;

/**
 * Clase que representa el curso en un instituto
 * @author Paul
 */
public class Curso {

    private String nombre;
    private TreeSet<Persona> listaAlumnos;

    protected String getNombre() {
        return nombre;
    }

    public Curso(String nombre) {
        this.nombre = nombre;
        listaAlumnos = new TreeSet<>();
    }
    /**
     * Metodo que sobreescribe el metodo toString para poder funcionar 
     * con objetos de tipo Curso
     * @return String 
     */
    @Override
    public String toString() {
        String s = "--------------------" + nombre + "-----------------\n";
        s += "NumExp\tNIF\t\tNombre\t\tApellidos\n";
        s += "-------------------------------------------------\n";
        for (Persona listaAlumno : listaAlumnos) {
            s += listaAlumno + "\n";
        }
        return s;
    }
    /**
     * Metodo que añade un alumno nuevo a la lista de alumnos del curso
     * @param p de tipo Persona
     */
    public void aniadirAlumno(Persona p) {
        listaAlumnos.add(p);
    }
}
