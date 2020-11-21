package homeWork20_11;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Customer customer1 = new Customer("Ginger", 19, "female");
        Customer customer2 = new Customer("Pol",27, "male");
        Customer customer3 = new Customer("Scarlett",17,"female");

        Product rose = new Product("Rose", "Greenhouse");
        Product pion = new Product("Pion", "Greenhouse");
        Product narcissus = new Product("Narcissus", "Garden bed");

        Order order = new Order(customer1, rose);
        Order order1 = new Order(customer2,pion);

        ArrayList<Order> allOreders = new ArrayList<>();
        allOreders.add(order);
        allOreders.add(order1);

       Customer[] customers = new Customer[3];
       customers[0] = customer1;
       customers[1] = customer2;
       customers[2] = customer3;

       Product[] products = new Product[3];
       products[0] = rose;
       products[1] = pion;
       products[2] = narcissus;

        System.out.println("Choose option: \n1. Add new order \n2. Watch orders");
        int n = in.nextInt();
        if (n == 1) {
            addNewOrder(customers, products, allOreders);
        } else if (n == 2){
            printOrders(allOreders);
        }
    }

    public static void printOrders(ArrayList<Order> allOreders){
        for (int i = 0; i < allOreders.size(); i++){
            System.out.println("order " + i + ": \n Customer is "+allOreders.get(i).getCustomer() +
                    "\n Product is "+ allOreders.get(i).getProduct() );
            System.out.println();
        }
    }

    public static void addNewOrder(Customer[] customers, Product[] products, ArrayList<Order> allOreders){
        Scanner in = new Scanner(System.in);
        System.out.println("Choose a customer");

        for (int i=0; i < customers.length;i++){
            System.out.println(i +  ". " + customers[i].getName());
        }
        int j = in.nextInt();

        System.out.println("Choose product");
        for (int i=0; i < products.length;i++){
            System.out.println(i +  ". " + products[i].getName());
        }
        int l = in.nextInt();

        Order newOrder = new Order(customers[j], products[l]);
        allOreders.add(newOrder);
        System.out.println("New order added: \n Customer is "+allOreders.get(allOreders.size()-1).getCustomer() +
                "\n Product is "+ allOreders.get(allOreders.size()-1).getProduct() );
    }
}
