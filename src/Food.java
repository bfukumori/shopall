public class Food extends Product {
    private final String expireDate;
    private final String ingredients;

    public String getExpireDate() {
        return expireDate;
    }

    public String getIngredients() {
        return ingredients;
    }

    public Food(String name, double price, String description, int stock, Manufacturer manufacturer, String expireDate, String ingredients) {
        super(name, price, description, stock, manufacturer);
        this.expireDate = expireDate;
        this.ingredients = ingredients;
    }

    public void show() {
           this.showBasicInfo();
           System.out.println("Data de validade: " + this.expireDate + "\nIngredientes: " + this.ingredients);
           this.showManufacturerInfo();
    };
}
