import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product();
        productsArray[1] = new Product("QA Engineer", LocalDate.of(2026, 10, 23), "Aston", "Russia", new BigDecimal("600000"), true);
        productsArray[2] = new Product("This Lesson", LocalDate.of(2026, 10, 23), "Aleksei", "Russia", new BigDecimal("0"), false);
        productsArray[3] = new Product("Tovar", LocalDate.of(2024, 10, 01), "TFBROInc", "Amerika", new BigDecimal("67"), true);
        productsArray[4] = new Product("Test", LocalDate.of(5051, 12, 31), "50", "-", new BigDecimal("600000.66666666"), false);

        productsArray[0].printInfo();
        productsArray[1].printInfo();
        productsArray[2].printInfo();
        productsArray[3].printInfo();
        productsArray[4].printInfo();

        Park park1 = new Park();
        Park.Attraction att1 = park1.new Attraction("Горка", "с пяти до 6", 100.20);
        Park.Attraction att2 = park1.new Attraction("Колесо", "два", 200);
        Park.Attraction att3 = park1.new Attraction("Кораблик", "2", 400.459);

        att1.printInfo();
        att2.printInfo();
        att3.printInfo();
    }
}
