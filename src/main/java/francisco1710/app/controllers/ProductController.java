package francisco1710.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import francisco1710.app.models.entities.ProductEntity;
import francisco1710.app.models.services.ProductServiceImpl;

@RestController
public class ProductController {
	
	@Autowired
	private ProductServiceImpl productService;
	
	
	@PostMapping("/addproduct")
	public ProductEntity addProduct(@RequestBody ProductEntity product) {
		
		return productService.saveProduct(product);
	}

	@PostMapping("/addproducts")
	public List<ProductEntity> addProducts(@RequestBody List<ProductEntity> products) {
		
		return productService.saveProducts(products);
	}
	
	@GetMapping("/products")
	public List<ProductEntity> findAllProducts(){
		
		return productService.getProducts();
	}
	
	@GetMapping("/product/{id}")
	public ProductEntity findProductById(@PathVariable int id) {
		
		return productService.getProductById(id);
	}
	
	@GetMapping("/product/{name}")
	public ProductEntity findProductById(@PathVariable String name) {
		
		return productService.getProductByProductname(name);
	}
	
	@PutMapping("/update")
	public ProductEntity updateProduct(@RequestBody ProductEntity product) {
		
		return productService.updateProduct(product);
	}
	
	@DeleteMapping("/")
	public String deleteProduct(@PathVariable int id) {
		
		return productService.deleteProduct(id);
	}
	
	
	
	
}
