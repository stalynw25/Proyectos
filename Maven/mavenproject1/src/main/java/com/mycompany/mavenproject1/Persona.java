/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;


/**
 *
 * @author bstal
 */
public class Persona {

  private String cedula;
  private String nombre ;
  private String direccion;

    public Persona(String cedula, String nombre, String direccion) {
        super();
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

   
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
   @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", nombre=" + nombre + ", direccion=" + direccion + '}';
    }
  
}
