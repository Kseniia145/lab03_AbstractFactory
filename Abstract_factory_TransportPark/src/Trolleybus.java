public class Trolleybus extends Transport {
    public Trolleybus(int cost, int usageCost) {
        super(cost, usageCost);
    }

    @Override
    public void run() {
        System.out.println("Trolleybus runs!");
    }
}
