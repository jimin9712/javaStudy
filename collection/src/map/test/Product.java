package map.test;

import java.util.Objects;

import org.json.JSONObject;

public class Product {
//   상품 번호, 상품 이름, 상품 가격, 상품 재고, 4개의 필드로 구성되어 있다.
	private int id;
	private String name;
	private int price;
	private int stock;

	public Product() {
		;
	}

	public Product(int id, String name, int price, int stock) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", stock=" + stock + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
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
		return id == other.id;
	}

//   JSON -> Object
	public JSONObject toJSONObject() {
		return new JSONObject(this);
	}

//   String -> JSON
	public String toJSONString() {
		return new JSONObject(this).toString();
	}

}
