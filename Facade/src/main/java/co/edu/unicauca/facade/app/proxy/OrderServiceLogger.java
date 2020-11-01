package co.edu.unicauca.facade.app.proxy;


import co.edu.unicauca.facade.access.IOrderRepository;
import co.edu.unicauca.facade.domain.order.OrderFacade;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Camilo Gonzalez
 */
public class OrderServiceLogger implements IOrderService {
    private OrderFacade orderFacade;

    public OrderServiceLogger(OrderFacade orderFacade) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean save(IOrderRepository repo) {
        if (orderFacade == null){
            orderFacade = new OrderFacade();
            return orderFacade.save(repo);
        }else{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates. 
        }
    }

}
