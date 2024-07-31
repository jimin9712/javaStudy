package list.task.product;

import java.util.Objects;


//[심화실습2]
//상품 관리
//	상품 클래스 선언
//	상품 CRUD 선언
//	- 상품 추가
//	- 상품 조회
//	- 상품 수정
//	- 상품 삭제
//	- 상품 목록

public class Product {
//		상품아이디
	private String productId;
//		상품명
	private String productName;
//		가격
	private int price;
//		재고
	private int quantitiy;

	public Product() {
		;
	}

	public Product(String productId, String productName, int price, int quantitiy) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantitiy = quantitiy;
	}

	public Product(Product product) {
		this(product.getProductId(), product.getProductName(), product.getPrice(), product.getQuantitiy());
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantitiy() {
		return quantitiy;
	}

	public void setQuantitiy(int quantitiy) {
		this.quantitiy = quantitiy;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", quantitiy="
				+ quantitiy + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(price, productId, productName, quantitiy);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return price == other.price && Objects.equals(productId, other.productId)
				&& Objects.equals(productName, other.productName) && quantitiy == other.quantitiy;
	}
	
}
