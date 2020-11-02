/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.facade.access;

import co.edu.unicauca.facade.domain.order.Order;
import java.util.ArrayList;

/**
 * la interfaz representa la operacion a realizar contra un registro de ordenes
 * @author Edynson Muñoz Jimenez, Juan Camilo Gonzales Mulato
 */
public interface IOrderRepository {
    public void createOrder(Order order);
    public ArrayList<Order>GetAll();
}
