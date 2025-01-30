//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ElectronicsProduct [] electronicsProduct = new ElectronicsProduct[5];
        electronicsProduct [0] = new ElectronicsProduct("Mobile", 30000);
        electronicsProduct [1] = new ElectronicsProduct("TV",60000);
        electronicsProduct[2] = new ElectronicsProduct("Laptop",80000);
        electronicsProduct[3] = new ElectronicsProduct("Watch", 20000);
        electronicsProduct[4] = new ElectronicsProduct("Headphones", 5000);

        for(ElectronicsProduct product : electronicsProduct){
            product.display();
        }
        System.out.println();
        UtilNew.sort(electronicsProduct);
        for(ElectronicsProduct product : electronicsProduct){
            product.display();
        }
        System.out.println();


        ClothingProduct [] clothingProducts = new ClothingProduct[5];
        clothingProducts[0] =new ClothingProduct("Jeans", 1500);
        clothingProducts[1] =new ClothingProduct("Saree", 2500);
        clothingProducts[2] =new ClothingProduct("T-shirt",500);
        clothingProducts[3] =new ClothingProduct("Jackets", 6000);
        clothingProducts[4] =new ClothingProduct("Shirts", 1300);

        for(ClothingProduct product : clothingProducts){
            product.display();
        }
        System.out.println();
        UtilNew.sort(clothingProducts);
        for(ClothingProduct product : clothingProducts){
            product.display();
        }



    }
}