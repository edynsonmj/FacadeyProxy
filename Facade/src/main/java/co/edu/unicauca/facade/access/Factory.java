/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.facade.access;

/**
 * fabrica de repositorios
 * @author Edynson Muñoz Jimenez, Juan Camilo Gonzales Mulato
 */
public class Factory {
    private static Factory instance;
    private Factory(){
        
    }
    public static Factory getInstance(){
        if (instance == null){
            instance = new Factory();
        }
        return instance;
    }
    public IOrderRepository getRepository(String tipo){
        IOrderRepository repositorio=null;
        if(tipo.equals("default")){
            repositorio = new OrderRepositoryList();
        }
        return repositorio;
    }
}
