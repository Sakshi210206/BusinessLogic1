public class Product {
    private int id;
    private int price;
    private String name;
    private double discount;
    private static int counter = 1;
    public Product(){
        id = counter++;
        name = "Mobile";
        price = 30000;
    }
    public Product(String name, int price){
        id = counter++;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiscount() {
        return discount;
    }

    public double setDiscount(double discount) {
        return this.discount = discount;

    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Product.counter = counter;
    }
    public void display(){
        System.out.print(id+" "+name+" "+price+ " ");
    }
}
