package az.baxtiyargil.cleanarch.adapter.out;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "merchant", schema = "cleanarch")
public class MerchantJpaEntity implements Serializable {

    @Id
    @GeneratedValue(
            generator = "merchant_seq_gen",
            strategy = GenerationType.SEQUENCE
    )
    @SequenceGenerator(
            name = "merchant_seq_gen",
            sequenceName = "seq_merchant_id",
            allocationSize = 1
    )
    private Integer id;

    @Column(
            name = "name",
            nullable = false,
            updatable = false
    )
    private String name;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "website")
    private String website;

    @Column(name = "joined_at",
            nullable = false,
            updatable = false)
    private LocalDateTime joinedAt;

    @OneToMany(mappedBy = "merchant",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private List<ProductJpaEntity> products;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProductJpaEntity that)) {
            return false;
        }
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}
