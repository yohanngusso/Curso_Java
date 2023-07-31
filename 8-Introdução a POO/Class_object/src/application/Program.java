import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        //System.out.println("Product data: " + product.name + ", " + "$ " + product.price + ", " + product.quantity + " units, Total: $ " + product.totalValueInStock());
        
        System.out.println("Product data: " + product);
        System.out.println("");
        System.out.printf("Enter the number of products to be added in stock: ");
        int valor = sc.nextInt();
        product.addProducts(valor);
        System.out.println("");
        System.out.println("Updata data: " + product);
        System.out.println("");
        System.out.printf("Enter the number of products to be removed from: ");
        int valor2 = sc.nextInt();
        product.removeProducts(valor2);
        System.out.println("");
        System.out.println("Updata data: " + product);




        









        sc.close();
    }
}
