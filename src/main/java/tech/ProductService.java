package tech;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	   @Autowired
	    private ProductRepository productRepository;

	    public void addProduct(String name, String category, double price, String imageUrl) {
	        ProductEntity product = new ProductEntity();
	        product.setName(name);
	        product.setCategory(category);
	        product.setPrice(price);
	        product.setImageUrl(imageUrl);
	        product.setCreatedDate(new Timestamp(new Date().getTime()));
	        productRepository.save(product);
	    }

	    public List<ProductEntity> getAllProducts() {
	        return productRepository.findAll();
	    }

	    public void deleteProduct(int id) {
	    	if (productRepository.existsById(id)) {
	            productRepository.deleteById(id);
	        }
	    
	    }

}
