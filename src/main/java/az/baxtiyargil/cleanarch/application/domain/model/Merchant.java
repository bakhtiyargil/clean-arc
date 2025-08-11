package az.baxtiyargil.cleanarch.application.domain.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Merchant {

    String id;
    String name;
    String address;
    String phone;
    String email;
    String website;
    LocalDateTime joinedAt;

}
