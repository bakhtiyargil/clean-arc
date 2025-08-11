package az.baxtiyargil.cleanarch.adapter.out;

import az.baxtiyargil.cleanarch.application.domain.model.Product;
import az.baxtiyargil.cleanarch.application.port.out.LoadProductPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProductPersistenceAdapter implements LoadProductPort {

    private final ProductRepository productRepository;

    @Override
    public Product loadProductById(String productId) {
        return productRepository.findById(productId)
                .orElseThrow(() -> new IllegalArgumentException("Product not found"));
    }
}
