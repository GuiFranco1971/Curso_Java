package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades_enum.OrderStatus;

public class Order {

	private Client client;
	private Date moment;
	private OrderStatus status;
	private List<OrderItem> itens = new ArrayList<>();

	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	public Order(Client client, Date moment, OrderStatus status) {
		this.client = client;
		this.moment = moment;
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public void addItem(OrderItem item) {
		itens.add(item);
	}

	public void removeItem(OrderItem item) {
		itens.remove(item);
	}

	public double totalOrder() {
		double soma = 0;
		for (OrderItem item : itens) {
			soma += item.subTotal();
		}
		return soma;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("RESUMO DO PEDIDO\n");
		sb.append(
				"-------------------------------------------------------------------------------------------------\n");
		sb.append("Data/Hora do Pedido: " + sdf.format(moment) + "\n");
		sb.append("Status do Pedido: " + status + "\n");
		sb.append("Cliente: " + client + "\n");
		sb.append(
				"-------------------------------------------------------------------------------------------------\n");
		sb.append("Itens do Pedido\n");
		for (OrderItem item : itens) {
			sb.append(item);
		}
		sb.append(
				"-------------------------------------------------------------------------------------------------\n");
		sb.append("TOTAL DO PEDIDO: R$ " + String.format("%.2f", totalOrder()) + "\n");

		return sb.toString();
	}

}
