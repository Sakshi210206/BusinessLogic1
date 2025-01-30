public class ElectronicsProduct extends Product implements  Comparable,Discountable{
    private double finalPrice;

    public ElectronicsProduct(String name, int price){
        super(name,price);
        finalPrice = setDiscount(0.8 * price);
    }
    @Override
    public int compareTo(Object o1) {
        ElectronicsProduct e1 = (ElectronicsProduct) o1;
        if (this.getPrice() > e1.getPrice()) {
            return 1;
        } else if (this.getPrice() < e1.getPrice()) {
            return -1;
        }
        return 0;
    }

    @Override
    public double discount() {
       if(finalPrice > 30000){
           return (0.7 * finalPrice);
       }
       return finalPrice;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(finalPrice);
    }
}
