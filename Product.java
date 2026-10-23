import java.time.LocalDate;
import java.math.BigDecimal;


public class Product{
    private String title;
    private LocalDate date;
    private String manufacturer;
    private String country;
    private BigDecimal price;
    private boolean status;

    public Product() {}

    public Product(String title, LocalDate date, String manufacturer,
        String country, BigDecimal price, Boolean status) {
            this.title = title;
            this.date = date;
            this.manufacturer = manufacturer;
            this.country = country;
            this.price = price;
            this.status = status;
        }
        
    public void printInfo() {
        System.out.println("Название продукта: " + title);
        System.out.println("Дата изготовления: " + date);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна изготовления: " + country);
        System.out.println("Цена: " + price);
        if (status == true) {
            System.out.println("Состояние бронирования покупателем: Забронировано");
        } else {
            System.out.println("Состояние бронирования покупателем: Не забронировано");
        }
    }
}
