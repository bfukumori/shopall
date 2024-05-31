public class Drink extends Food{
    private final boolean isAlcoholic;
    private final int volume;

    public Drink(String name, double price, String description, int stock, Manufacturer manufacturer, String expireDate, String ingredients, boolean isAlcoholic, int volume) {
        super(name, price, description, stock, manufacturer, expireDate, ingredients);
        this.isAlcoholic = isAlcoholic;
        this.volume = volume;
    }

    private String isAlcoholicToString() {
        return this.isAlcoholic ? "Sim" : "Não";
    };

    public void show() {
        this.showBasicInfo();
        System.out.println("Data de validade: " + this.getExpireDate() + "\nIngredientes: " + this.getIngredients() + "\nVolume: " + this.volume + "\nAlcoólico: " + isAlcoholicToString());
        this.showManufacturerInfo();
    };
}
