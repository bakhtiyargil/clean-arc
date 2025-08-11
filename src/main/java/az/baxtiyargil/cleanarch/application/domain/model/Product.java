package az.baxtiyargil.cleanarch.application.domain.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product {

    Integer id;
    String name;
    String description;
    BigDecimal price;
    String imageUrl;
    LocalDateTime createdAt;
    Merchant merchant;

}
