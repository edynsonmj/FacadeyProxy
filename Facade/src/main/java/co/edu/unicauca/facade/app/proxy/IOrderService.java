/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.facade.app.proxy;

import co.edu.unicauca.facade.access.IOrderRepository;


/**
 *
 * @author Camilo Gonzalez
 */
public interface IOrderService {
    
   boolean  save(IOrderRepository repo);
        
}
