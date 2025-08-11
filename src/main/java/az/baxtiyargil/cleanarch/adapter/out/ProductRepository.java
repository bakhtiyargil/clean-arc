package az.baxtiyargil.cleanarch.adapter.out;

import az.baxtiyargil.cleanarch.application.domain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
}
