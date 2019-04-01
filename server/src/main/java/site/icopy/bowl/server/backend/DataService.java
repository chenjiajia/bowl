package site.icopy.bowl.server.backend;

import java.io.Serializable;
import java.util.Collection;

import site.icopy.bowl.server.backend.data.Category;
import site.icopy.bowl.server.backend.data.Product;
import site.icopy.bowl.server.backend.mock.MockDataService;

/**
 * Back-end service interface for retrieving and updating product data.
 */
public abstract class DataService implements Serializable {

    public abstract Collection<Product> getAllProducts();

    public abstract Collection<Category> getAllCategories();

    public abstract void updateProduct(Product p);

    public abstract void deleteProduct(int productId);

    public abstract Product getProductById(int productId);

    public static DataService get() {
        return MockDataService.getInstance();
    }

}
