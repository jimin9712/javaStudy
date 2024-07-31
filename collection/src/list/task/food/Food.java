package list.task.food;

import java.util.Objects;

public class Food {
	private String name;
	private int price;
	private String kind;

	public Food() {
		;
	}

	public Food(Food food) {
		this(food.getName(), food.getPrice(), food.getKind());
	}

	public Food(String name, int price, String kind) {
		super();
		this.name = name;
		this.price = price;
		this.kind = kind;
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

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + ", kind=" + kind + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Food other = (Food) obj;
		return name.equals(other.name);
	}

}
