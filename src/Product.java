import java.text.NumberFormat;
import java.util.Locale;

public class Product {
    private final String name;
    private final double price;
    private final String description;
    private final int stock;
    private final Manufacturer manufacturer;

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
    public int getStock() {
        return stock;
    }
    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    private final Locale ptBR = Locale.of("pt", "BR");

    private String formatPrice(double price) {
       return NumberFormat.getCurrencyInstance(ptBR).format(price);
    }

    public Product(String name, double price, String description, int stock, Manufacturer manufacturer) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.stock = stock;
        this.manufacturer = manufacturer;
    }

    protected void showBasicInfo() {
        System.out.println("Nome: " + this.getName() + "\nDescrição: " + this.getDescription() + "\nPreço: " + this.formatPrice(this.getPrice()) + "\nEstoque: " + this.getStock());
    };
    protected void showManufacturerInfo() {
        this.manufacturer.showInfo();
    };

}
