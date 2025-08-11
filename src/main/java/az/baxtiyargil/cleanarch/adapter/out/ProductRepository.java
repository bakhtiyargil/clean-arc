package az.baxtiyargil.cleanarch.adapter.out;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductJpaEntity, String> {

    @Query(""" 
               SELECT p
                 FROM ProductJpaEntity p
            LEFT JOIN FETCH p.merchant
                WHERE p.id = :productId
            """)
    Optional<ProductJpaEntity> findByIdWithMerchant(String productId);
}
