package app;

public class Main {
    public static void main(String[] args) {
        // Отримуємо вхідні дані
        String[] data = getData();
        // Формуємо об'єкт з вхідних даних
        Product product = new Product(data[0],
                Integer.parseInt(data[1]),
                Double.parseDouble(data[2]));
        // Розраховуємо базову вартість товару
        CalcCostBase costBase = new CalcCostBase();
        double baseCost = costBase.calcCost(product);
        // Розраховуємо вартість товару, з урахуванням доставки
        CalcCostDelivery costDelivery = new CalcCostDelivery();
        double deliveryCost = costDelivery.calcCost(product);

        System.out.println(product + " " + baseCost + ".");
        System.out.println(product + " " + deliveryCost + ".");
    }

    // Набір вхідних даних
    public static String[] getData() {
        return new String[] {"abc", "5", "2.5"};
    }

}
