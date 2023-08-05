package entities;

public class Product_encapsulado {
    private String name;
    private double price;
    private int quantity;

    
    //construtor padrão 
    public Product_encapsulado(){
        
    }

    public Product_encapsulado(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //sobrecarga -> + um construtor com diferentes parametros
    public Product_encapsulado(String name, double price){
        this.name = name;
        this.price = price;
    }

    //Encapsulamento get e set geralmente feito depois do construtor

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    //sobre a quantidade já possui métodos para restringir quando é adicionado e removido 


    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}