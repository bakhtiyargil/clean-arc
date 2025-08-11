package az.baxtiyargil.cleanarch.application.port.out;

import az.baxtiyargil.cleanarch.adapter.out.ProductJpaEntity;

public interface LoadProductPort {

    ProductJpaEntity loadProductById(String productId);

}
