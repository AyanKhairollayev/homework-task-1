package kz.khairollayev;

/**
 * Склад
 *
 * countDeliveredOrders счетчик для доставленных заказов
 * countPickedOrders счетчик для принятых заказов
 */
public class Warehouse {
    private int countDeliveredOrders;
    private int countPickedOrders;

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    /**
     * Вызывается у складовщика
     */
    public void incrementPickedOrders() {
        this.countPickedOrders++;
    }

    /**
     * Вызывается у курьера
     */
    public void incrementDeliveredOrders() {
        this.countDeliveredOrders++;
    }

    /**
     * Переопределенный метод
     * @return строчное представление объекта
     */
    @Override
    public String toString() {
        return "Warehouse{" +
                "countDeliveredOrders=" + countDeliveredOrders +
                ", countPickedOrders=" + countPickedOrders +
                '}';
    }
}
