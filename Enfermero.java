/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francisco Molina
 */
public class Enfermero extends Trabajador {
    private int xp;
    private boolean intensivo;
    
    public void Enfermero(String nombre, long nit, double sueldo, long dpi, boolean intensivo, int xp){
        this.nombre=nombre;
        this.nit=nit;
        this.sueldo=sueldo;
        this.dpi=dpi;
        this.intensivo=intensivo;
        this.xp=xp;
    }
    @Override
    public double calcularBono(int horas){
        int bono;
        int num;
        bono=0;
        if (horas>4){
            num=horas-4;
            bono=num*500;
        } else{
            bono=0;
        }
        return bono;
    }
    
}
