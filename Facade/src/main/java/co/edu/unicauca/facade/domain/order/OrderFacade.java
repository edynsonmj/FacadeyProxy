/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.facade.domain.order;

import co.edu.unicauca.facade.access.IOrderRepository;
import co.edu.unicauca.facade.app.proxy.IOrderService;

/**
 * representa la fachada para las operaciones de ordenes
 *
 * @author Edynson Muñoz Jimenez, Juan Camilo Gonzalez Mulato
 */
public class OrderFacade implements IOrderService {

    /**
     * orden del restaurante
     */
    private Order order;

    /**
     * constructor por defecto
     */
    public OrderFacade() {
    }

    /**
     * AUN NO IMPLEMENTADO, crea una orden para un cliente
     *
     * @param customer cliente
     */
    public void createOrder(Customer customer) {
        order = new Order(customer);
    }

    /**
     * adiciona un plato a la orden
     *
     * @param dish plato
     * @param amount cantidad de platos
     */
    public void addDish(Dish dish, int amount) {
        order.addDish(dish, amount);
    }

    /**
     * AUN NO IMPLEMENTADO, cambia el estado del pedido
     *
     * @param state statado
     */
    public void changeState(State state) {
        order.setState(state);
    }

    /**
     * cambia el estado de la orden a cancelado
     */
    public void cancelOrder() {
        this.order.setState(State.CANCELLED);
    }

    /**
     * calcula el costo de la orden
     *
     * @return total de la orden (costo)
     */
    public int calculateTotal() {
        return this.order.calculateTotal();
    }

    /**
     * muestro la cantidad de platos
     *
     * @return cantidad de platos en la orden
     */
    public int totalDishes() {
        return this.order.getDetails().size();
    }
    //SET AND GET

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public void save(IOrderRepository repo) {
        repo.createOrder(this.order);
    }
}
