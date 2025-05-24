import java.util.Map;

public class Cafe {
    private CoffeeMachineFactory factory;
    private int days;
    private Map<String, Integer> sales;

    public Cafe(CoffeeMachineFactory factory, int days, Map<String, Integer> sales) {
        this.factory = factory;
        this.days = days;
        this.sales = sales;
    }

    public double calculateProfit() {
        double income = 0;
        double cost = factory.getMachineCost() + factory.getMaintenancePerDay() * days;

        for (Map.Entry<String, Integer> entry : sales.entrySet()) {
            Coffee coffee = switch (entry.getKey()) {
                case "Espresso" -> factory.createEspresso();
                case "Americano" -> factory.createAmericano();
                case "Cappuccino" -> factory.createCappuccino();
                case "Latte" -> factory.createLatte();
                default -> throw new IllegalArgumentException("Unknown coffee: " + entry.getKey());
            };
            income += coffee.getPrice() * entry.getValue();
            cost += coffee.getCost() * entry.getValue();
        }

        return income - cost;
    }
}