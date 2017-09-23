/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francisco Molina
 */
public class Medico extends Trabajador {
    private boolean especialista;
    private long numColegiado;
    
    /**
     * constructor de medico, hereda de trabajador nombre, nit, sueldo y dpi
     * @param nombre
     * @param nit
     * @param sueldo
     * @param dpi
     * @param especialista
     * @param numColegiado 
     */
    
    public void Medico(String nombre, long nit, double sueldo, long dpi, boolean especialista, long numColegiado){
        this.nombre=nombre;
        this.nit=nit;
        this.sueldo=sueldo;
        this.dpi=dpi;
        this.especialista=especialista;
        this.numColegiado=numColegiado;
    }
    /**
     * metodo que define comportamiento de calcularBono heredado de trabajador.
     * @param horas 
     * @return retorna bono de un medico.
     */
    @Override
    public double calcularBono(int horas){
        int bono;
        int num;
        bono=0;
        if (horas>2){
            num=horas-2;
            bono=num*900;
        } else{
            bono=0;
        }
        return bono;
    }


}
