package co.edu.unicauca.facade.access;

import co.edu.unicauca.facade.domain.order.Order;
import java.util.ArrayList;

/**
 * la interfaz representa la operacion a realizar contra un registro de ordenes
 *
 * @author Edynson Muñoz Jimenez, Juan Camilo Gonzales Mulato
 */
public interface IOrderRepository {

    public void createOrder(Order order);

    public ArrayList<Order> GetAll();
}
