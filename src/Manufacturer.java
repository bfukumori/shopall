public class Manufacturer {
     String name;
     String address;
     String phoneNumber;

    public Manufacturer(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void showInfo() {
        System.out.println("Fabricante: " + "\n\tNome: " + this.name + "\n\tEndereço: " + this.address + "\n\tTelefone: " + this.phoneNumber);
    }
}
