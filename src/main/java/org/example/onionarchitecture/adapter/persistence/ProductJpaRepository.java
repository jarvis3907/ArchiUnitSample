package org.example.onionarchitecture.adapter.persistence;


import org.example.onionarchitecture.domain.model.Product;
import org.example.onionarchitecture.domain.service.ProductName;

@SuppressWarnings("unused")
public class ProductJpaRepository implements ProductRepository {
    @Override
    public Product read(ProductId id) {
        return new Product(id, new ProductName("would normally be read"));
    }

    @Override
    public long getTotalCount() {
        return 0;
    }
}
