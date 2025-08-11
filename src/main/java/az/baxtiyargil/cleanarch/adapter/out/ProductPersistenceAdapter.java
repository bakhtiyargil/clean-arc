package az.baxtiyargil.cleanarch.adapter.out;

import az.baxtiyargil.cleanarch.application.domain.model.Product;
import az.baxtiyargil.cleanarch.application.port.out.LoadProductPort;
import az.baxtiyargil.cleanarch.application.port.out.UpdateProductMerchantPort;
import az.baxtiyargil.cleanarch.common.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProductPersistenceAdapter implements LoadProductPort, UpdateProductMerchantPort {

    private final Mapper mapper;
    private final ProductRepository productRepository;

    @Override
    public ProductJpaEntity loadProductById(String productId) {
        return productRepository.findByIdWithMerchant(productId)
                .orElseThrow(() -> new IllegalArgumentException("Product not found"));
    }

    @Override
    public void update(Product product) {
        productRepository.save(mapper.productToProductJpa(product));
    }
}
