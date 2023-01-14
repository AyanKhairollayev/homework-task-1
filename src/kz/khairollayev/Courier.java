package kz.khairollayev;

/**
 * Курьер, реализует интерфейс Worker
 * salary текущая прибыль курьера
 * DEFAULT_SALARY заработная плата, константы пишутся заглавными буквами и разделяются нижним пробелом
 * isPayed true/false, был ли выплачен бонус
 * warehouse текущий склад
 */
public class Courier implements Worker{
    private int salary;
    private static final int DEFAULT_SALARY = 100;
    private boolean isPayed;
    Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    /**
     * Переопредленный метод
     * вызывает метод у склада и увеличивает принятый заказ на один
     * добавляет зарплату в текущую прибыль
     */
    @Override
    public void doWork() {
        warehouse.incrementDeliveredOrders();
        salary += DEFAULT_SALARY;
    }

    /**
     * Переопределенный метод
     * проверяет был ли выплачен бонус
     * если нет и все условия отработаны, то доабвляет бонус в текущую прибыль
     */
    @Override
    public void bonus() {
        if(warehouse.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
            return;
        }

        if(isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }

        salary += 50000;
        isPayed = true;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                ", warehouse=" + warehouse +
                '}';
    }
}
