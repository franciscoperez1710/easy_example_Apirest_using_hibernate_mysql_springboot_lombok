package francisco1710.app.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import francisco1710.app.models.entities.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity,Integer>{

	ProductEntity findByProductname(String productname);

}
