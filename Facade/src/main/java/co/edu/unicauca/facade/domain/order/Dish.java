
package co.edu.unicauca.facade.domain.order;

/**
 * representa un plato...
 *
 * @author edynso muñoz Jimenez, Juan Camilo gonzales mulato
 */
public class Dish {

    /**
     * identificador del plato
     */
    private int id;
    /**
     * nombre del plato
     */
    private String name;
    /**
     * costo del plato
     */
    private int price;

    /**
     * constructor por defecto
     */
    public Dish() {
    }

    /**
     * constructor parametrizado
     *
     * @param id identificador del plato
     * @param name nombre del plato
     * @param price precio o costo del plato
     */
    public Dish(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    //SET AND GET
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
