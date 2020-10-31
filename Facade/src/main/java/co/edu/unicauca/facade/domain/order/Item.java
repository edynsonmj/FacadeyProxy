/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.facade.domain.order;

/**
 * representa...
 * @author Edynson Muñoz Jimenez, Juan Camilo Gonzalez Mulato
 */
public class Item {
    /**
     * representa el plato
     */
    private Dish dish;
    /**
     * ...
     */
    private int amount;

    /**
     * constructor por defecto
     */
    public Item() {
    }

    /**
     * constructor parametrizado
     * @param dish plato
     * @param amount no se que esto?
     */
    public Item(Dish dish, int amount) {
        this.dish = dish;
        this.amount = amount;
    }

    //SET AND GET
    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    
}
