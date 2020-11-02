package co.edu.unicauca.facade.access;

import co.edu.unicauca.facade.domain.order.Order;
import java.util.ArrayList;

/**
 * Representa una lista donde se almacenan las ordenes
 * @author Edynson Muñoz Jimenez, Juan Camilo Gonzales Mulato
 */
public class OrderRepositoryList implements IOrderRepository {

    ArrayList<Order> ordenes;

    public OrderRepositoryList() {
        ordenes = new ArrayList<Order>();
    }

    @Override
    public ArrayList<Order> GetAll() {
        return ordenes;
    }

    @Override
    public void createOrder(Order order) {
        ordenes.add(order);
    }
}
