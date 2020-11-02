/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.facade.access;

import co.edu.unicauca.facade.domain.order.Order;
import java.util.ArrayList;


/**
 *
 * @author EdynsonMJ
 */
public class OrderRepositoryList implements IOrderRepository{
    ArrayList<Order> ordenes;
    
    public OrderRepositoryList (){
        ordenes = new ArrayList<Order>();
    }
    @Override
    public ArrayList<Order>GetAll(){
        return ordenes;
    }
    
    @Override
    public void createOrder(Order order) {
        ordenes.add(order);
    }
}
