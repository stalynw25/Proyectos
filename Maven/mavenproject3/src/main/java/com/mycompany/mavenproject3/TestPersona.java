/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

import com.mycompany.mavenproject1.Persona;
import com.mycompany.mavenproject2.ServPersona;

/**
 *
 * @author bstal
 */
public class TestPersona {
    private static ServPersona sp;
    
    public static void main(String[] args){
    
    sp = new ServPersona();
    sp.instertar(new Persona ("1234567890", "Luis", "Calderon"));
    
    for (Persona persona : sp.mostrar()){
        System.out.println(persona);
    }
    
    }
    
}
