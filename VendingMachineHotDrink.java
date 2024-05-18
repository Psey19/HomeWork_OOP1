import java.util.ArrayList;
import java.util.List;

public class VendingMachineHotDrink implements VendingMachine{
    private List<Product> productList = new ArrayList<>();

    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }

    @Override
    public void initProducts(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }
    public Product getProduct(String name, double value, int temperature){
        for (Product product : productList) {
            if (product.getName().equals(name) && ((BottleOfWater)product).getVolume() == value
                    && ((HotDrink)product).getTemperature() == temperature) {
                return product;
            }
        }
        return null;
    }
}
