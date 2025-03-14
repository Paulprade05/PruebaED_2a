/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instituto;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

/**
 * Clase que representa una Persona en el instituto
 *
 * @author Paul
 *
 */
public class Persona implements Comparable<Persona> {

    private Nif nif;
    private String nombre;
    private char genero;
    private LocalDate nacimiento;

    public Persona() {
        nif = new Nif();
        nombre = "";
        genero = ' ';
        nacimiento = LocalDate.of(1990, 1, 1);
    }

    public Persona(int nif) {
        this();
        this.nif = new Nif(nif);
    }

    public Persona(int nif, String nombre, char genero,
            int dia, int mes, int ano) {
        this.nif = new Nif(nif);
        this.nombre = nombre;
        this.genero = genero;
        this.nacimiento
                = LocalDate.of(ano, mes, dia);
    }

    public Nif getNif() {
        return nif;
    }
    /**
     * Setter del nif de la persona
     * @param nif Nif
     */
    public void setNif(Nif nif) {
        this.nif = nif;
    }
    /**
     * Getter del nombre de la persona
     * @return String
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Setter del nombre de la persona
     * @param nombre String
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Getter del genero de la persona 
     * @return char
     */
    public char getGenero() {
        return genero;
    }
    /**
     * Setter del genero de la persona
     * @param genero se le debe pasar un caracter
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }
    /**
     * 
     * @return la fecha de nacimiento como LocalDate
     */
    public LocalDate getNacimiento() {
        return nacimiento;
    }
    /**
     * Un set para la fecha de nacimiento de la persona
     * @param nacimiento se le pasa un LocalDate
     */
    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }
    /**
     * 
     * @return un int de la edad de la persona
     */
    public int getEdad() {
        return Period.between(nacimiento, LocalDate.now()).getYears();
    }

    /**
     * Metodo que sobreescribe el metodo toString para poder usarlo con objetos
     * de tipo Persona
     *
     */
    @Override
    public String toString() {
        if (nombre.split(" ").length > 1) {
            return nif + "\t" + nombre.split(" ")[0]
                    + '\t' + nombre.split(" ")[1] + "\t\t" + getEdad();
        } else {
            return nif + "\t" + nombre + "\t\t\t" + getEdad();
        }
    }

    /**
     * Metodo que sobreescribe el metodo equals para poder usarlo con objetos de
     * tipo Persona
     *
     * @param a se refiere a un objeto de tipo Persona
     *
     */
    public boolean equals(Persona a) {
        if (a == null) {
            return false;
        }
        return a.nif.toString().equals(this.nif.toString());
    }

    /**
     * Metodo que sobreescribe el metodo equals para poder usarlo con cualquier
     * tipo de objetos
     *
     * @param obj se le pasa un objeto de cualquier tipo
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;

        return Objects.equals(this.nif, other.nif);
    }

    /**
     * Metodo que sobreescribe el metodo compareTo para poder comparar 2 objetos
     * de tipo persona
     *
     * @param o hace referencia a un objeto de tipo Persona
     * @return
     */
    @Override
    public int compareTo(Persona o) {
        return this.nif.toString().compareTo(o.nif.toString());
    }

}
