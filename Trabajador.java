/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Clase abstracta de trabajadores, esta le heredara ciertos atributos a sus clases
 * hijas: Medico y enfermero.
 * @author Francisco Molina
 */
public abstract class Trabajador {
    protected String nombre;
    protected long nit;
    protected double sueldo;
    protected long dpi;
    
    public String getNombre(){
        return nombre;
    }
    public double getSueldo(){
        return sueldo;
    }
    public long getDPI(){
        return dpi;
    }
    public long getNIT(){
        return nit;
    }
    public abstract double calcularBono(int horas);
    
}
