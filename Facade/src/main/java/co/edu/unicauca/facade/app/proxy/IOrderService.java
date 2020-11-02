
package co.edu.unicauca.facade.app.proxy;

import co.edu.unicauca.facade.access.IOrderRepository;


/**
 * la interfaz representa la operacion a guardar un servicio en el sistema
 * @author Edynson Muñoz Jimenez, Juan Camilo Gonzales Mulato
 */
public interface IOrderService {
    
   public void  save(IOrderRepository repo);
}
