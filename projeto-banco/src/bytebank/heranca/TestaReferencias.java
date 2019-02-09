package bytebank.heranca;

public class TestaReferencias {

	public static void main(String[] args) {

		/*
		 * Como um Gerente � um Funcionario � possivel,
		 * criar um objeto que � do tipo Gerente com uma v�riavel 
		 * que � do tipo Funcionario.
		 * Aten��o: desta forma a v�riavel g1 s� poder� chamar os m�todos
		 * da classe Funcionario.*/
		
		Funcionario g1 = new Gerente();

		g1.setNome("Pedro");
		g1.setSalario(1200.9);
		System.out.println(g1.getNome() + " " + g1.getSalario() + " " + g1.getBonificacao());
		
		/*
		 * Para chamar os m�todos do Gerente e do Funcionario,
		 * somente declarando a v�riavel do tipo Gerente.*/
		
		Gerente g2 = new Gerente();
		g2.setNome("Paulo");
		g2.setSalario(1200.90);
		g2.autentica(1234);
		System.out.println(g2.getNome() + " " + g2.getSalario() + " " + g2.getBonificacao());
		
	}
}
