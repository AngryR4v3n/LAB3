

import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francisco Molina
 */
public class Clinica {
    public Trabajador matrizT[][]= new Trabajador[31][12];
    private Random randomFila = new Random();
    private Random randomCol = new Random();
    public Medico listaM[];
    public Enfermero listaE[];
    public Grupo listaG[];

    public Clinica() {
        listaM=new Medico[5];
        listaE=new Enfermero[5];
        listaG=new Grupo[25];
        listaM[0]=new Medico("Juan Perez","6799652-3",15000,"1234567870101", true, 89098);
        listaM[1]=new Medico("Luis Gutierrez","8964547-3",12000,"9876543260101", false, 98554);
        listaM[2]=new Medico("Eduardo Gonzalez","8786456-6",17000,"5642871750101", true, 5653);
        listaM[3]=new Medico("Guadalupe Torres","5684873-1",17000,"4562973920101", true, 10098);
        listaM[4]=new Medico("Maria Castillo","8765485-7", 13000, "569395290101", false, 67965);
        
        listaE[0]=new Enfermero("Juana Lopez","563269-K", 6000, "5643213450101", false,2);
        listaE[1]=new Enfermero("Lidia Mendez","7654376-6", 9000, "1246547850101", true,2);
        listaE[2]=new Enfermero("Miriam Garcia","9876456-8", 8000, "6547854370101", false,14);
        listaE[3]=new Enfermero("Lorna Suarez", "4567865-8", 10000, "569374160101", true,12);
        listaE[4]=new Enfermero("Mariela Rodriguez", "6789654-8", 8000, "3254786540101", false,2);
    }
    public Grupo[] crearGrupo(Medico[] lista1, Enfermero[] lista2){
        for(int x=0; x<25; x++){
            for (int i=0; i<5; i++){
                for(int j=0; j<5; j++){
                    Medico objMed=lista1[i];
                    Enfermero objEnfe=lista2[j];
                    Grupo miGrupo = new Grupo(x,objMed.getNombre(), objEnfe.getNombre());
                    listaG[x]=miGrupo;
        
                }
            }
        }
        return listaG;
        
    }
    public String cambioEnfermera(String nombre, Grupo[] listaGrupos) {
       String msj;
       msj="";
       for(int x=0; x<25; x++){
           if(listaGrupos[x].getEnfermera().equals(nombre)){
               msj="el nuevo grupo es: "+listaGrupos[x].getId();
           } else {
               msj="ese grupo no existe";
           }
       }
       return msj;
    }
    
}
