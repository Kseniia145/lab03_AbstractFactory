public class Main {
    public static void main(String[] args) {
        final int A = 10;
        final int T = 5;
        final int Tr = 40;
        final int N = 200_000;

        TransportFactory[] factories = {
            new VolvoFactory(),
            new SkodaFactory(),
            new HyundaiFactory()
        };

        String[] names = {"Volvo", "Skoda", "Hyundai"};
        int minTotal = Integer.MAX_VALUE;
        String best = "";

        for (int i = 0; i < factories.length; i++) {
            TransportFactory factory = factories[i];
            int total = 0;

            for (int j = 0; j < A; j++) {
                Transport bus = factory.createBus();
                total += bus.getCost() + bus.getUsageCost() * N;
            }
            for (int j = 0; j < T; j++) {
                Transport tram = factory.createTram();
                total += tram.getCost() + tram.getUsageCost() * N;
            }
            for (int j = 0; j < Tr; j++) {
                Transport trolley = factory.createTrolleybus();
                total += trolley.getCost() + trolley.getUsageCost() * N;
            }

            System.out.printf("%s: Загальні витрати = %,d грн%n", names[i], total);

            if (total < minTotal) {
                minTotal = total;
                best = names[i];
            }
        }

        System.out.printf("Найвигідніше: %s з сумою %,d грн%n", best, minTotal);
    }
}
