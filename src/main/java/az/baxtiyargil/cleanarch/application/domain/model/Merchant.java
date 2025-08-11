package az.baxtiyargil.cleanarch.application.domain.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Merchant {

    Integer id;
    String name;
    String address;
    String phone;
    String email;
    String website;
    LocalDateTime joinedAt;
    List<Product> products;

}
