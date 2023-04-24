/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.uv.programa04;

import java.util.Iterator;
import java.util.List;

/**
 *
 */
public class Programa04 {

    public static void main(String[] args) {
        DAOEmpleado daoEmpleado=new DAOEmpleado();
        Empleado emp=new Empleado(25, "Gabriel", "Av1", "1111");
        //TransaccionGuardarEmpleado tge=new TransaccionGuardarEmpleado(emp);
        
        /*create  
        daoEmpleado.create(emp);*/
        
        /*delete for clave
        daoEmpleado.delete(2L);*
        
        
        /*update
        emp.setClave(25);
        emp.setNombre("sag");
        emp.setDireccion("Calle 1");
        emp.setTelefono("2711141778");
        daoEmpleado.update(emp, emp.getClave());
        */
        
       /*findAll
        List<Empleado> lista=daoEmpleado.findAll();
        Iterator <Empleado> i = lista.iterator();
        while(i.hasNext()){
            emp=i.next();
            System.out.println(" Clave: "+emp.getClave()+"\n Nombre: "+emp.getNombre()+"\n Dirección: "+emp.getDireccion()+"\n Telefono: "+emp.getTelefono() + "\n <------------------------------>");
        }*/
        
       
       /*findByID
       Empleado emp2=new Empleado();
       emp2=daoEmpleado.findbyID(25L, emp2);
       System.out.println("Nombre: " +emp2.getNombre());*/
        
    }
}
