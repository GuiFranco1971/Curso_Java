package entities;

public class PessoaJuridica extends Contribuinte {

	private Integer nroFunc;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer nroFunc) {
		super(nome, rendaAnual);
		this.nroFunc = nroFunc;
	}

	public Integer getNroFunc() {
		return nroFunc;
	}

	public void setNroFunc(Integer nroFunc) {
		this.nroFunc = nroFunc;
	}

	@Override
	public Double vlrImposto() {
		double valor = 0;
	
		if (this.nroFunc <= 10) 
			valor = this.getRendaAnual() * 0.16;
		else 
			valor = this.getRendaAnual() * 0.14;
				
		return valor;
	}
}
