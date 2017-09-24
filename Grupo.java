

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francisco Molina
 */
public class Grupo {

    private String nombreM;
    private String nombreE;
    private int x;

 

    public Grupo(){
    
}
    public Grupo(int x,String nombreM, String nombreE){
        this.x=x;
        this.nombreM=nombreM;
        this.nombreE=nombreE;
        
                
    }
    public String getEnfermera(){
        return nombreE;
    }
    public int getId(){
        return x;
    }
}
