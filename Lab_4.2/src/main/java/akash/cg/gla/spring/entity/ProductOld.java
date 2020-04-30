package akash.cg.gla.spring.entity;

public class ProductOld {
	
	private int prodId;
	private String prodName;
	private int prodPrice;
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
	public ProductOld(int prodId, String prodName, int prodPrice) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
	}
	public ProductOld() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ProductOld [prodId=" + prodId + ", prodName=" + prodName + ", prodPrice=" + prodPrice + "]";
	}
	
	

}
