package az.baxtiyargil.cleanarch.application.port.out;

import az.baxtiyargil.cleanarch.application.domain.model.Product;

public interface LoadProductPort {

    Product loadProductById(String productId);

}
