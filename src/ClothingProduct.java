public class ClothingProduct extends Product implements Comparable,Discountable{
    double finalPrice;

    public ClothingProduct( String name, int price){
        super(name,price);
        finalPrice = setDiscount(0.9 * price);
    }
    @Override
    public int compareTo(Object o1) {
        ClothingProduct c1 = (ClothingProduct) o1;
        if(this.getPrice() > c1.getPrice()){
            return 1;
        }else if(this.getPrice() < c1.getPrice()){
            return -1;
        }
        return 0;
    }

    @Override
    public double discount() {
        if(finalPrice > 5000){
            return (0.8 * finalPrice);
        }
        return getPrice();
    }

    @Override
    public void display() {
        super.display();
        System.out.println(finalPrice);
    }
}
