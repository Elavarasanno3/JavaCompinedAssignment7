package javaassignmentcompined;

public class Product {
    private String name;
    private int productId;
    private double price;
    private boolean inOffer;

    public Product(String name ,int productId,double price,boolean inOffer){
        this.name = name;
        this.productId = productId;
        this.price = price;
        this.inOffer = inOffer;
    }
    public void printDetails(){
        System.out.println("Product Name : "+ name);
        System.out.println("Product Id : "+ productId);
        System.out.println("Product Price : "+ price);
        System.out.println("Product is in Offer : "+ inOffer);
    }
    public static void main(String[] args) {
        Product product1 = new Product("Mobile", 123, 10000, false);
        product1.printDetails();
    }
}
