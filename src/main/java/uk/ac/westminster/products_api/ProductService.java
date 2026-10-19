package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    public Optional<Product> getProductById(Long id) {
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }

    public void deleteProduct(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }

}
