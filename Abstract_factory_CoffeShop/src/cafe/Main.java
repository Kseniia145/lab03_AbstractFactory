import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> sales = new HashMap<>();
        sales.put("Espresso", 40);
        sales.put("Americano", 30);
        sales.put("Cappuccino", 25);
        sales.put("Latte", 20);

        int days = 30;

        Cafe cafeJura = new Cafe(new JuraFactory(), days, sales);
        Cafe cafeDeLonghi = new Cafe(new DeLonghiFactory(), days, sales);

        System.out.printf("Прибуток з %s: %.2f€\n", "Jura", cafeJura.calculateProfit());
        System.out.printf("Прибуток з %s: %.2f€\n", "DeLonghi", cafeDeLonghi.calculateProfit());
    }
}