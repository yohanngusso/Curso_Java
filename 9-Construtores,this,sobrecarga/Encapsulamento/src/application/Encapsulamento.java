package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product_encapsulado;

public class Encapsulamento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //primeiro pede os valores e armazenas em variaveis e dps coloca nos parametros
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        // System.out.print("Quantity in stock: ");
        // int quantity = sc.nextInt();
        System.out.println();
        Product_encapsulado product = new Product_encapsulado(name, price);

        //agora se eu quiser obter -> método get
        String nome_produto = product.getName();
        //agora para alterar -> método set
        product.setName("LIQUIDIFICADOR");


        System.out.println(nome_produto);
        System.out.println("Product data: " + product);
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);
        System.out.println();

        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + product);
        sc.close();
    }
}