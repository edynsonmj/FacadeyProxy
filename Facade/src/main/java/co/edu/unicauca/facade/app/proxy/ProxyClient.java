package co.edu.unicauca.facade.app.proxy;

import co.edu.unicauca.facade.access.Factory;
import co.edu.unicauca.facade.access.IOrderRepository;
import co.edu.unicauca.facade.app.client.Main;
import co.edu.unicauca.facade.app.proxy.IOrderService;
import java.lang.System.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Camilo Gonzalez
 */
public class ProxyClient {

    private IOrderService orderService;

    public ProxyClient(IOrderService orderService) {
        this.orderService = orderService;
    }

    public void createOrder() {
        IOrderRepository repo = Factory.getInstance().getRepository("default");
        this.orderService.save(repo);
        /*org.slf4j.Logger logger = LoggerFactory.getLogger(OrderServiceLogger.class);
        String message = "Pedido guardado en la base de datos";
        logger.info("Pedido guardado en la base de datos");
        logger.debug("Mensaje de depuración");
        logger.error("Mensaje de error");*/
    }
}
