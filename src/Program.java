import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;

        do {
            menu();

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    registerElectronic(sc);
                    break;
                case 2:
                    registerClothing(sc);
                    break;
                case 3:
                    registerFood(sc);
                    break;
                case 4:
                    registerDrink(sc);
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida");
            }
        } while(option !=0);
        sc.close();
    }
    private static void menu() {
        System.out.println("\n-----SHOPALL SYSTEM-----\n");
        System.out.println("Escolha uma opção: \n");
        System.out.println("1 - Cadastrar um produto eletrônico: ");
        System.out.println("2 - Cadastrar um produto de vestuário: ");
        System.out.println("3 - Cadastrar um produto alimentício: ");
        System.out.println("4 - Cadastrar uma bebida: ");
        System.out.println("0 - Sair do programa");
    }

    private static Product registerBasicInfo(Scanner sc) {
        System.out.print("Digite o nome: ");
        String name = sc.nextLine();
        System.out.print("Digite a descrição: ");
        String description = sc.nextLine();
        System.out.print("Digite o preço: ");
        double price = sc.nextDouble();
        sc.nextLine();
        System.out.print("Digite a quantidade em estoque: ");
        int stock = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o nome do fabricante: ");
        String manufacturerName = sc.nextLine();
        System.out.print("Digite o endereço do fabricante: ");
        String manufacturerAddress = sc.nextLine();
        System.out.print("Digite o número de telefone do fabricante: ");
        String manufacturerContact = sc.nextLine();

        Manufacturer manufacturer = new Manufacturer(manufacturerName, manufacturerAddress, manufacturerContact);

        return new Product(name, price, description, stock, manufacturer);
    }

    private static void registerElectronic(Scanner sc) {
        Product basicInfo = registerBasicInfo(sc);

        System.out.print("Digite o modelo: ");
        String model = sc.nextLine();

        Electronic electronic = new Electronic(basicInfo.getName(), basicInfo.getPrice(), basicInfo.getDescription(), basicInfo.getStock(), basicInfo.getManufacturer(), model);

        System.out.println("\n--Produto eletrônico cadastrado com sucesso!--\n");
        electronic.show();
    }

    private static void registerClothing(Scanner sc) {
        Product basicInfo = registerBasicInfo(sc);

        System.out.println("Escolha o tamanho:");
        for (Size size : Size.values()) {
            System.out.println(size);
        }
        System.out.print("Digite o tamanho: ");
        String sizeInput = sc.nextLine().toUpperCase();
        System.out.print("Digite a cor: ");
        String color = sc.nextLine();
        System.out.print("Digite o material: ");
        String material = sc.nextLine();

        Clothing clothing = new Clothing(basicInfo.getName(), basicInfo.getPrice(), basicInfo.getDescription(), basicInfo.getStock(), basicInfo.getManufacturer(), sizeInput, color, material);

        System.out.println("\n--Produto de vestuário cadastrado com sucesso!--\n");
        clothing.show();
    }

    private static void registerFood(Scanner sc) {
        Product basicInfo = registerBasicInfo(sc);

        System.out.print("Digite a data de validade (dd/mm/aaaa): ");
        String expireDate = sc.nextLine();
        System.out.print("Digite os ingredientes: ");
        String ingredients = sc.nextLine();

        Food food = new Food(basicInfo.getName(), basicInfo.getPrice(), basicInfo.getDescription(), basicInfo.getStock(), basicInfo.getManufacturer(), expireDate, ingredients);

        System.out.println("\n--Produto alimentício cadastrado com sucesso!--\n");
        food.show();
    }

    private static void registerDrink(Scanner sc) {
        Product basicInfo = registerBasicInfo(sc);

        System.out.print("Digite a data de validade (dd/mm/aaaa): ");
        String expireDate = sc.nextLine();
        System.out.print("Digite os ingredientes: ");
        String ingredients = sc.nextLine();
        System.out.print("Digite o volume (em ml): ");
        int volume = sc.nextInt();
        sc.nextLine();
        System.out.print("É alcóolico (true/false): ");
        boolean isAlcoholic = sc.nextBoolean();

        Drink drink = new Drink(basicInfo.getName(), basicInfo.getPrice(), basicInfo.getDescription(), basicInfo.getStock(), basicInfo.getManufacturer(), expireDate, ingredients, isAlcoholic, volume);

        System.out.println("\n--Bebida cadastrada com sucesso!--\n");
        drink.show();
    }
}
