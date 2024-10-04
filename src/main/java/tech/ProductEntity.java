package tech;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="products")

public class ProductEntity {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO) ////generate automatically
	
	 private int productId;
	    private String name;
	    private String category;
	    private double price;
	    private String imageUrl;
	    private Timestamp createdDate;

	    // Getters and Setters
	    public int getproductId() {
	        return productId;
	    }

	    public void setId(int id) {
	        this.productId = productId;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getCategory() {
	        return category;
	    }

	    public void setCategory(String category) {
	        this.category = category;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    public String getImageUrl() {
	        return imageUrl;
	    }

	    public void setImageUrl(String imageUrl) {
	        this.imageUrl = imageUrl;
	    }

	    public Timestamp getCreatedDate() {
	        return createdDate;
	    }

	    public void setCreatedDate(Timestamp createdDate) {
	        this.createdDate = createdDate;
	    }

	   

	   
    
}
