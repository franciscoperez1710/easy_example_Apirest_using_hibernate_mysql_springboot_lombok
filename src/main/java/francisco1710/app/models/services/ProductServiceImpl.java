package francisco1710.app.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import francisco1710.app.models.entities.ProductEntity;
import francisco1710.app.models.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements IProductService{
	
	@Autowired
	private ProductRepository productRepo;

	@Override
	public ProductEntity saveProduct(ProductEntity product) {

		return productRepo.save(product);
	}

	@Override
	public List<ProductEntity> saveProducts(List<ProductEntity> products) {
	
		return productRepo.saveAll(products);
	}

	@Override
	public List<ProductEntity> getProducts() {

		return productRepo.findAll();
	}

	@Override
	public ProductEntity getProductById(int product_code) {
	
		return productRepo.findById(product_code).orElse(null);
	}

	@Override
	public ProductEntity getProductByProductname(String productname) {
	
		return productRepo.findByProductname(productname);
	}

	@Override
	public String deleteProduct(int productcode) {
		
		productRepo.deleteById(productcode);
	
		return "product removed "+productcode;
	}

	@Override
	public ProductEntity updateProduct(ProductEntity product) {
		
		ProductEntity existingProduct = productRepo.findById(product.getProductcode()).orElse(null);
		existingProduct.setProductname(product.getProductname());
		existingProduct.setProductquantity(product.getProductquantity());
		existingProduct.setProductprice(product.getProductprice());
		existingProduct.setProductdescription(product.getProductdescription());
		
		return productRepo.save(existingProduct);
	}

	
	
	
	

}
