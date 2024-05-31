public class Clothing extends Product{
private final String size;
private final String color;
private final String material;

    public Clothing(String name, double price, String description, int stock, Manufacturer manufacturer, String size, String color, String material) {
        super(name, price, description, stock, manufacturer);
        this.size = size;
        this.color = color;
        this.material = material;
    }
    public void show() {
        this.showBasicInfo();
        System.out.println("Tamanho: " + this.size + "\nCor: " + this.color + "\nMaterial: " + this.material);
        this.showManufacturerInfo();
    };
}
