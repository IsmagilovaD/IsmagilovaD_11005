package homeWork20_11;


public class Order {
    private Customer customer;
    private Product product;

    Order(Customer customer, Product product){
        this.customer = customer;
        this.product = product;
    }

    public String getProduct(){
        return this.product.getName();
    }

    public String getCustomer(){return customer.getName(); }


}
