package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTerceirizado;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		 * List<Funcionario> : uma lista do tipo Funcionario.
		 * list : que chamaremos de list.
		 * new ArrayList<>() : uma nova lista do tipo ArrayList<>(). 
		 */
		List<Funcionario> list = new ArrayList<>();
		
		System.out.print("Digite a quantidade de funcionários: ");
		Integer n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Dados do funcionário #" + i +":");
			System.out.print("Terceirizado [s/n]? ");
			char terc = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Horas: ");
			Integer horas = sc.nextInt();
			System.out.print("Valor por Hora: R$ ");
			Double valorPorHora = sc.nextDouble();

			/*
			 * Se terc for igual a 's' solicitará  o valor do bônus adicional do terceirizado e
			 * a classe FuncionarioTerceirizado será instanciada e os valores armazenados na lista.
			 * Se terc for igual a 'n' a classe Funcionario será instanciada e os valores armazenados na lista.
			 */
			if (terc == 's') {
				System.out.print("Digite o bônus adicional do terceirizado: R$ ");
				Double bonusAdicional = sc.nextDouble();
				Funcionario fun = new FuncionarioTerceirizado(nome, horas, valorPorHora, bonusAdicional);
				list.add(fun);
			} else if (terc == 'n') {
				Funcionario fun = new Funcionario(nome, horas, valorPorHora);
				list.add(fun);
			}	
		}
		
		System.out.println();
		System.out.println("PAGAMENTOS:");
		
		// Para cada objeto fun do tipo Funcionario da minha Lista list.
		for (Funcionario fun : list) {
			System.out.println(fun.getNome() + " - R$ " + String.format("%.2f", fun.pagamento()));
		}				
	}
}
