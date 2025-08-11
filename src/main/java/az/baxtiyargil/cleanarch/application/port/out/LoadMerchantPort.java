package az.baxtiyargil.cleanarch.application.port.out;

import az.baxtiyargil.cleanarch.adapter.out.MerchantJpaEntity;

public interface LoadMerchantPort {

    MerchantJpaEntity loadMerchantById(String merchantId);

}
