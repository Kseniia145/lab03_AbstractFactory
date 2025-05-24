public class DeLonghiFactory implements CoffeeMachineFactory {
    public Coffee createEspresso() { return new Espresso(); }
    public Coffee createAmericano() { return new Americano(); }
    public Coffee createCappuccino() { return new Cappuccino(); }
    public Coffee createLatte() { return new Latte(); }
    public double getMachineCost() { return 3500; }
    public double getMaintenancePerDay() { return 15; }
    public String getManufacturer() { return "DeLonghi"; }
}