package tech;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
	
    // Additional query methods can be defined here
	
	@Modifying
    @Transactional
    public void deleteByProductId(int productId);
	

}

