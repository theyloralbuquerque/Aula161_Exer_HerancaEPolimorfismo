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
	public Double pagamento() { // polimorfismo do m�todo pagamento() da superclasse.
		return super.pagamento() + bonusAdicional * 1.10; // a reutiliza��o do m�todo pagamento + bonusAdicional * 1.10.
	}

}