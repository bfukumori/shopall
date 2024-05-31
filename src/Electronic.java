public class Electronic extends Product{
    private final String model;

    public Electronic(String name, double price, String description, int stock, Manufacturer manufacturer, String model) {
        super(name, price, description, stock, manufacturer);
        this.model = model;
    }

    public void show() {
        this.showBasicInfo();
        System.out.println("Modelo: " + this.model);
        this.showManufacturerInfo();
    };
}
