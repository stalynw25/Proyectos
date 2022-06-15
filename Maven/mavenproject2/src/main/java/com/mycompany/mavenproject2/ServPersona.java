/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject2;

import com.mycompany.mavenproject1.Persona;
import java.util.ArrayList;

/**
 *
 * @author bstal
 */
public class ServPersona {
   
    
    ArrayList<Persona> personas;
    
    public ServPersona(){
        personas= new ArrayList<>();
        }
    
    public ArrayList<Persona> mostrar(){
        return personas;
    
    }
    
    public void instertar(Persona persona){
        personas.add(persona);    
    }
    
    public Persona buscar(String cedula){
        Persona p=null;
        for(Persona persona : personas){
            if(persona.getCedula().equals(cedula)){
                p=persona;
            }
                }
        return p;
        }
}
