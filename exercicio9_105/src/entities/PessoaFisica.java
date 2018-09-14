package entities;

public class PessoaFisica extends Contribuinte {

	private Double gastoSaude;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public Double vlrImposto() {
		double valor = 0;
	
		if (this.getRendaAnual() < 20000.00) 
			valor = this.getRendaAnual() * 0.15;
		else 
			valor = this.getRendaAnual() * 0.25;
		
		double desconto = this.gastoSaude * 0.50;
		return (valor - desconto);
	}

}
