/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instituto;

/**
 * Clase que representa el Nif de una persona
 * @author Paul
 */
public class Nif {

    private int numero;
    private char letra;

    //CONSTANTE: no accesible - compartido por todo - no modificable
    private static final char[] LETRAS
            = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
                'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
                'C', 'K', 'E'};

    private static char calcularLetra(int numero) {
        return LETRAS[numero % 23];
    }

    protected Nif() {
        this.numero = 0;
        this.letra = ' ';
    }

    protected Nif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }
    /**
     * Metodo que sobreescribe el metodo toString para poder usarse con Nif, 
     * devuelve el numero, un guion y la letra
     * @return String
     */
    @Override
    public String toString() {
        return numero + "-" + letra;
    }
    /**
     * Metodo que sirve para setear un Nif pidiendo un numero y calculando su letra
     * @param numero de tipo int
     */
    protected void setNif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }
    /**
     * Metodo que sobreescribe el metodo equals 
     * @param obj recibe cualquier tipo de objeto
     * @return boolean
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
        final Nif other = (Nif) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return this.letra == other.letra;
    }
}
