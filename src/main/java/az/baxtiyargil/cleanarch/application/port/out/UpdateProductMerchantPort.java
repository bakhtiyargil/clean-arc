package az.baxtiyargil.cleanarch.application.port.out;

import az.baxtiyargil.cleanarch.application.domain.model.Product;

public interface UpdateProductMerchantPort {

    void update(Product product);
}
