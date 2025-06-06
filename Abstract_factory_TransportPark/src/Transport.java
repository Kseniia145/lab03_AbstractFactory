public abstract class Transport {
    private final int cost;
    private final int usageCost;

    protected Transport(int cost, int usageCost) {
        this.cost = cost;
        this.usageCost = usageCost;
    }

    public int getCost() {
        return cost;
    }

    public int getUsageCost() {
        return usageCost;
    }

    public abstract void run();
}
