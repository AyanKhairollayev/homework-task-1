package kz.khairollayev;

/**
 * Складовщик, реализует интерфейс Worker
 * salary текущая прибыль складовщика
 * DEFAULT_SALARY заработная плата, константы пишутся заглавными буквами и разделяются нижним пробелом
 * isPayed true/false, был ли выплачен бонус
 * warehouse текущий склад
 */
public class Picker implements Worker{
    private int salary;
    private static final int DEFAULT_SALARY = 80;
    private boolean isPayed;
    Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    /**
     * Переопредленный метод
     * вызывает метод у склада и увеличивает принятый заказ на один
     * добавляет зарплату в текущую прибыль
     */
    @Override
    public void doWork() {
        warehouse.incrementPickedOrders();
        salary += DEFAULT_SALARY;
    }

    /**
     * Переопределенный метод
     * проверяет был ли выплачен бонус
     * если нет и все условия отработаны, то добавляет бонус в текущую прибыль
     */
    @Override
    public void bonus() {
        if(warehouse.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
            return;
        }

        if(isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }

        salary += 70000;
        isPayed = true;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                ", warehouse=" + warehouse +
                '}';
    }
}
