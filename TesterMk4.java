import java.util.Scanner;

public class TesterMk4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Jumlah Data: ");
        int jumlahData = scanner.nextInt();

        Product[] p = new Product[jumlahData];
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Enter number: ");
            int number = scanner.nextInt();
            System.out.print("Enter name: ");
            String name = scanner.next();
            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();
            System.out.print("Enter price: ");
            double price = scanner.nextDouble();

            p[i] = new Product(number, name, quantity, price);
            p[i].print();
        }

        CD[] c = new CD[5];
        c[4] = new CD(); 

        scanner.close();
    }
}

class Product {
    int number;
    String name;
    int quantity;
    double price;

    public Product(int number, String name, int quantity, double price) {
        this.number = number;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public Product() {
    }

    public void print() {
        System.out.println("Product: " + name + ", Number: " + number + ", Quantity: " + quantity + ", Price: " + price);
    }
}

class CD {
    public CD() {
    }
}
