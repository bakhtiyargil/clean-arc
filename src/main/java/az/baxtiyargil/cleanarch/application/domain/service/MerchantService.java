package az.baxtiyargil.cleanarch.application.domain.service;

import az.baxtiyargil.cleanarch.application.port.in.AttachMerchantProductUseCase;
import az.baxtiyargil.cleanarch.application.port.out.LoadMerchantPort;
import az.baxtiyargil.cleanarch.application.port.out.LoadProductPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MerchantService implements AttachMerchantProductUseCase {

    private final LoadMerchantPort loadMerchantPort;
    private final LoadProductPort loadProductPort;

    @Override
    public void attachMerchantProduct(String merchantId, String productId) {
        var merchant = loadMerchantPort.loadMerchantById(merchantId);
        var product = loadProductPort.loadProductById(productId);
        product.attachToMerchant(merchant);
    }

}
