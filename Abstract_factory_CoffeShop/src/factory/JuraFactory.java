public class JuraFactory implements CoffeeMachineFactory {
    public Coffee createEspresso() { return new Espresso(); }
    public Coffee createAmericano() { return new Americano(); }
    public Coffee createCappuccino() { return new Cappuccino(); }
    public Coffee createLatte() { return new Latte(); }
    public double getMachineCost() { return 5000; }
    public double getMaintenancePerDay() { return 10; }
    public String getManufacturer() { return "Jura"; }
}