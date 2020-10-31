/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.facade.domain.order;

import co.edu.unicauca.facade.access.IOrderRepository;

/**
 * representa la fachada para las operaciones de ordenes
 * @author Edynson Muñoz Jimenez, Juan Camilo Gonzalez Mulato
 */
public class OrderFacade {
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
     * @param customer cliente
     */
    public void createOrder(Customer customer){
        order = new Order(customer);
    }
    /**
     * adiciona un plato a la orden
     * @param dish plato
     * @param amount cantidad de platos
     */
    public void addDish(Dish dish, int amount){
        order.addDish(dish, amount);
    }
    /**
     * AUN NO IMPLEMENTADO, cambia el estado del pedido
     * @param state statado
     */
    public void changeState(State state){
        order.setState(state);
    }
    /**
     * AUN NO IMPLEMENTADO
     */
    public void cancelOrder(){
        
    }
    /**
     * aun no implementado
     * @return total de la orden (costo)
     */
    public int calculateTotal(){
        return this.order.calculateTotal();
    }
    /**
     * aun no implemenatado
     * @return cantidad de platos en la orden
     */
    public int totalDishes(){
        return this.order.getList().size();
    }
    /**
     * aun no implementado
     */
    public void save(IOrderRepository repostitorio){
        
    }
    //SET AND GET
    
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    
}
