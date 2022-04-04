import java.util.ArrayList;
import java.util.List;

public class ListProducts implements  Products{

    private List<Product> products = new ArrayList<>();

    public ListProducts(){
        insert(new Product("pressure washer", 299.99));
        insert(new Product("nailgun", 99.45));
        insert(new Product("trim", 10.50));
    }



    @Override
    public List<Product> all() {
        return this.products;
    }

    @Override
    public void insert(Product productToInsert) {
        this.products.add(productToInsert);
    }
}
