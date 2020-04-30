package akash.cg.gla.spring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producttable")
public class Product {
	@Id
	private int prodId;
	private String prodName;
	private int prodPrice;
	private String category;
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(int prodPrice) {
		this.prodPrice = prodPrice;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Product(int prodId, String prodName, int prodPrice, String category) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.category = category;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodPrice=" + prodPrice + ", category="
				+ category + "]";
	}
	public Product(int prodId, String prodName, int prodPrice) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
	}

	

}
