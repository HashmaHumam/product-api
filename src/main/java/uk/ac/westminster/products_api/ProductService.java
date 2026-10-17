package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service

public class ProductService {
    // Internal list storing products in memory
    private List<Product> products = new ArrayList<>();

    // Counter to generate unique IDs starting at 1
    private Long nextId = 1L;

    // Returns all products in the collection
    public List<Product> getAllProducts() {
        return products;
    }

    // Assigns an ID, adds product to the list, and increments counter
    public Product addProduct(Product product) {
        product.setId(nextId++);
        products.add(product);
        return product;
    }

}
