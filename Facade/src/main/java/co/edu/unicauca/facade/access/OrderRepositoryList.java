/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.facade.access;

import co.edu.unicauca.facade.domain.order.OrderFacade;
import java.util.ArrayList;


/**
 *
 * @author EdynsonMJ
 */
public class OrderRepositoryList implements IOrderRepository{
    ArrayList<OrderFacade>orderFacade;
    
    public OrderRepositoryList (){
        orderFacade = new ArrayList<OrderFacade>();
    }
    public ArrayList<OrderFacade>GetAll(){
        return orderFacade;
    }
    public void save (OrderFacade orderFacad){
        orderFacade.add(orderFacad);
    }
}
