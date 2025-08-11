package az.baxtiyargil.cleanarch.adapter.in;

import az.baxtiyargil.cleanarch.application.port.in.AttachMerchantProductUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/merchants")
@RequiredArgsConstructor
public class MerchantController {

    private final AttachMerchantProductUseCase attachMerchantProductUseCase;

    @PostMapping("/{merchantId}/products/{productId}")
    public void attachMerchantProduct(@PathVariable String merchantId, @PathVariable String productId) {
        attachMerchantProductUseCase.attachMerchantProduct(merchantId, productId);
    }
}
