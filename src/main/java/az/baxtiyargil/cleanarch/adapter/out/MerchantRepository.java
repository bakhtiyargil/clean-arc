package az.baxtiyargil.cleanarch.adapter.out;

import az.baxtiyargil.cleanarch.application.domain.model.Merchant;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface MerchantRepository extends JpaRepository<Merchant,String>{
}
