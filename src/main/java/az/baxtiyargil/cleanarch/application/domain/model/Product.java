package az.baxtiyargil.cleanarch.application.domain.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product {

    String id;
    String name;
    String description;
    String price;
    String image;
    String merchantId;
    LocalDateTime createdAt;

    public void attachToMerchant(Merchant merchant) {
        this.merchantId = merchant.getId();
    }
}
