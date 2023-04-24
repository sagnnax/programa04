/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.uv.programa04;

import java.util.List;

/**
 *
 */
public interface IDAOGeneral <T,ID>{//Definiendo modelo abstracto
    public T create(T p);
    public boolean delete(ID id);
    public T update(T p, ID id); //recibe el pojo a actualizar y lo devuelve ya actualizado
    
    public List<T> findAll();
    public T findbyID(ID id, T t);
}
