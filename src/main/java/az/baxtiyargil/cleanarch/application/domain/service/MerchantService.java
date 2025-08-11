package az.baxtiyargil.cleanarch.application.domain.service;

import az.baxtiyargil.cleanarch.application.port.in.AttachMerchantProductUseCase;
import az.baxtiyargil.cleanarch.application.port.out.LoadMerchantPort;
import az.baxtiyargil.cleanarch.application.port.out.LoadProductPort;
import az.baxtiyargil.cleanarch.application.port.out.UpdateProductMerchantPort;
import az.baxtiyargil.cleanarch.common.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MerchantService implements AttachMerchantProductUseCase {

    private final Mapper mapper;
    private final LoadProductPort loadProductPort;
    private final LoadMerchantPort loadMerchantPort;
    private final UpdateProductMerchantPort updateProductMerchantPort;

    @Transactional
    @Override
    public void attachMerchantProduct(String merchantId, String productId) {
        var merchant = mapper.merchantJpaToMerchant(loadMerchantPort.loadMerchantById(merchantId));
        var product = mapper.productJpaToProduct(loadProductPort.loadProductById(productId));
        product.setMerchant(merchant);
        updateProductMerchantPort.update(product);
    }

}
