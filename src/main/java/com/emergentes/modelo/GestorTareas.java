/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes.modelo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ela
 */
public class GestorTareas {
    

    private ArrayList<Tarea> lista;
    public GestorTareas()
        {
            lista = new ArrayList<Tarea>();
            
        }
        
 //1.Agregar la propiedad gestor tareas
//2. Crear el constructor para inicializar la lista   

    public ArrayList<Tarea> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Tarea> lista) {
        this.lista = lista;
    }
    public void  insertarTarea (Tarea item)
    {   
       lista.add(item);
}
public void modificarTarea(int pos,Tarea item)
{
    lista.set(pos, item);
    }
public void eliminarTarea(int pos)
{
    lista.remove(pos);
    
}   
//agregar los metodos para realizar insercion modificacion eliminacion
public int obtieneId()
{
    int idaux = 0;
    for(Tarea item : lista){
        idaux = item.getId();
    }
    return idaux + 1;
}
public int ubicarTarea(int id)
{
    int pos = -1;
    Iterator<Tarea> it = lista.iterator();
    while (it.hasNext()){
     ++pos;
    Tarea aux = it.next();
    if (aux.getId() == id){
        break;
        
    }          
}
    return pos;
}
}
// agregar metodos adicionales para generar un id y encontrar una tarea

