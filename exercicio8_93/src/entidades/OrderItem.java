package entidades;

public class OrderItem {

	private Product product;
	private Integer quantity;

	public OrderItem() {
	}

	public OrderItem(Product product, Integer quantity) {
		this.product = product;
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double subTotal() {
		return this.product.getPrice() * this.quantity;
	}

	@Override
	public String toString() {
		return ("   " + product.getName() +
		        ", R$ " + String.format("%.2f", product.getPrice()) +
		        ", Quantidade: " + getQuantity() + 
		        ", Subtotal: R$ " + String.format("%.2f", subTotal()) + "\n");
	}
	
}
