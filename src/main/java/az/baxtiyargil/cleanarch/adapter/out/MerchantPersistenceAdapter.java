package az.baxtiyargil.cleanarch.adapter.out;

import az.baxtiyargil.cleanarch.application.domain.model.Merchant;
import az.baxtiyargil.cleanarch.application.port.out.LoadMerchantPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MerchantPersistenceAdapter implements LoadMerchantPort {

    private final MerchantRepository merchantRepository;

    @Override
    public Merchant loadMerchantById(String merchantId) {
        return merchantRepository.findById(merchantId)
                .orElseThrow(() -> new IllegalArgumentException("Merchant not found"));
    }
}
