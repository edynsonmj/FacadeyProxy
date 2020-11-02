package co.edu.unicauca.facade.app.proxy;

import co.edu.unicauca.facade.access.Factory;
import co.edu.unicauca.facade.access.IOrderRepository;
import co.edu.unicauca.facade.app.client.Main;
import co.edu.unicauca.facade.app.proxy.IOrderService;
import java.lang.System.Logger;
import org.slf4j.LoggerFactory;

/**
 * representa un cliente Proxy
 *
 * @author Edynson Muñoz Jimenez, Juan Camilo Gonzales Mulato
 */
public class ProxyClient {

    private IOrderService orderService;

    /**
     * Constructor Parametrizado
     *
     * @param orderService
     */
    public ProxyClient(IOrderService orderService) {
        this.orderService = orderService;
    }

    /**
     * Devulve una instacia del repositorio
     */
    public void createOrder() {
        IOrderRepository repo = Factory.getInstance().getRepository("default");
        this.orderService.save(repo);
    }
}
