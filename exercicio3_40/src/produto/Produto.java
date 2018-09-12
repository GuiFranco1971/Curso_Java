package produto;

public class Produto {

	public String name;
	public double price;
	public int quantity;

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int qt) {
		quantity += qt;
	}

	public void removeProducts(int qt) {
		quantity -= qt;
	}

	@Override
	public String toString() {
		return name + ", $ " +
	           String.format("%.2f", price) + ", " +
			   quantity + " units, Total: $ " +
	           String.format("%.2f", totalValueInStock());
	}

	
}
