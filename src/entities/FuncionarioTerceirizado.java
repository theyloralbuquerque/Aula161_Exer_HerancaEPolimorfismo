package entities;

public class FuncionarioTerceirizado extends Funcionario{
	
	 private Double bonusAdicional;

	 public FuncionarioTerceirizado() {
		 super();
	 }
	 
	public FuncionarioTerceirizado(String nome, Integer horas, Double valorPorHora, Double bonusAdicional) {
		super(nome, horas, valorPorHora);
		this.bonusAdicional = bonusAdicional;
	}
	
	@Override
	public Double pagamento() { // polimorfismo do método pagamento() da superclasse.
		return super.pagamento() + bonusAdicional * 1.10; // a reutilização do método pagamento + bonusAdicional * 1.10.
	}

}