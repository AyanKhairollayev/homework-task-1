package kz.khairollayev;

public class Task1 {
    public static void main(String[] args) {
        // Создаем склад и работников
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        // Симулируем работу для обоих
        businessProcess(picker);
        businessProcess(courier);

        // Выводим строчное представление обоих работников в консоль
        System.out.println(picker);
        System.out.println(courier);
    }

    /**
     * Симулирует работу курьера или складовщика
     * @param worker принимает работника
     */
    public static void businessProcess(Worker worker) {
        worker.bonus();

        for(int i = 0; i <= 10000; i++) {
            worker.doWork();
        }

        worker.bonus();
    }
}
