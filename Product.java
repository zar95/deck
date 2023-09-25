public class Product {
    private String name;
    private int quantity ;
    private int id;
   private double price;
   static int counter = 0;
    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public Product(String name,double price,int quantity ) {
id = ++counter;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.id = id;
    }
    public String toString(){
        return String.format("id:%d  product: %s  price:%.2f  Quantity:%d",this.id,this.name,this.price,this.quantity);
    }
    public Product Clone(){
        return new Product(this.getName(),this.getPrice(),this.getQuantity());

    }

}

