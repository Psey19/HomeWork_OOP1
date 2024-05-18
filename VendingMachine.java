import java.util.List;

public interface VendingMachine {

    public void addProduct(Product product);

    public void initProducts(List<Product> productList);

    public Product getProduct(String name);
}
