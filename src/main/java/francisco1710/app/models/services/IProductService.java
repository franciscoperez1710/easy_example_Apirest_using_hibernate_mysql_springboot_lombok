package francisco1710.app.models.services;

import java.util.List;

import francisco1710.app.models.entities.ProductEntity;

public interface IProductService {
	
	public ProductEntity saveProduct(ProductEntity product);
	public List<ProductEntity> saveProducts(List<ProductEntity> products);
	public List<ProductEntity> getProducts();
	public ProductEntity getProductById(int product_code);
	public ProductEntity getProductByProductname(String productname);
	public String deleteProduct(int productcode);
	public ProductEntity updateProduct(ProductEntity product);

}
