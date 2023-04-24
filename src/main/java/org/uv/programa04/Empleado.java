/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.programa04;

/**
 *
 */
public class Empleado {//Pojo empleado, Los pojos mapean direcctamente a la BD, Los DTO son solo para transporte de datos
    private long clave;
    private String nombre;
    private String direccion;
    private String telefono;
    public Empleado(long clave, String nombre, String direccion, String telefono){
        this.setClave(clave);
        this.setNombre(nombre);
        this.setDireccion(direccion);
        this.setTelefono(telefono);
    }
    public Empleado(){
        
    }
    public long getClave() {
        return clave;
    }

    public void setClave(long clave) {
        this.clave = clave;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
