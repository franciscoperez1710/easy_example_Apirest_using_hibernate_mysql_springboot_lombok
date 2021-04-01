package francisco1710.app.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Product")
public class ProductEntity {
	
	@Id
	@GeneratedValue
	private int productcode;
	private String productname;
	private int productquantity;
	private double productprice;
	private String productdescription;

}
