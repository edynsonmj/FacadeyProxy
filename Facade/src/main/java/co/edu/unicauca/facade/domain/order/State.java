/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.facade.domain.order;

/**
 * representa los estados en los que se encuentra el pedido
 * @author Edynson Muñoz Jimenz, Juan Camilo Gonzalez Mulato
 */
public enum State {
    NEW, CONFIRMED, DISPACHED, FINALIZED, CANCELLED
}
