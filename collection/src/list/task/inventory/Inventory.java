package list.task.inventory;

public class Inventory {
	private String productId;
	private int stock;

	public Inventory() {
		;
	}

	public Inventory(String productId, int stock) {
		this.productId = productId;
		this.stock = stock;
	}

	public Inventory(Inventory inventory) {
		this(inventory.getProductId(), inventory.getStock());
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Inventory [productId=" + productId + ", stock=" + stock + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Inventory other = (Inventory) obj;
		return productId.equals(other.productId);
	}
}
