package entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return (this.grossSalary - this.tax);
	}
	
	public void increaseSalary(double percent) {
		this.grossSalary *= 1 + (percent / 100);
	}

	@Override
	public String toString() {
		return this.name +
				", Salário Bruto R$ " + String.format("%.2f", this.grossSalary) +
				", Imposto R$ " + String.format("%.2f", this.tax) +
				", Salário Liquido R$ " + String.format("%.2f", this.netSalary());
		
	}
	
}
