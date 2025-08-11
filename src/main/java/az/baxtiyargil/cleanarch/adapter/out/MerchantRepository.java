package az.baxtiyargil.cleanarch.adapter.out;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface MerchantRepository extends JpaRepository<MerchantJpaEntity,String>{
}
