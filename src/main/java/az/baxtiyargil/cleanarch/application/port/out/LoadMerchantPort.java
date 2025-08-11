package az.baxtiyargil.cleanarch.application.port.out;

import az.baxtiyargil.cleanarch.application.domain.model.Merchant;

public interface LoadMerchantPort {

    Merchant loadMerchantById(String merchantId);

}
