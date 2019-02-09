package bytebank.heranca;

public class TestaReferencias {

	public static void main(String[] args) {

		/*
		 * Como um Gerente é um Funcionario é possivel,
		 * criar um objeto que é do tipo Gerente com uma váriavel 
		 * que é do tipo Funcionario.
		 * Atenção: desta forma a váriavel g1 só poderá chamar os métodos
		 * da classe Funcionario.*/
		
		Funcionario g1 = new Gerente();

		g1.setNome("Pedro");
		g1.setSalario(1200.9);
		System.out.println(g1.getNome() + " " + g1.getSalario() + " " + g1.getBonificacao());
		
		/*
		 * Para chamar os métodos do Gerente e do Funcionario,
		 * somente declarando a váriavel do tipo Gerente.*/
		
		Gerente g2 = new Gerente();
		g2.setNome("Paulo");
		g2.setSalario(1200.90);
		g2.autentica(1234);
		System.out.println(g2.getNome() + " " + g2.getSalario() + " " + g2.getBonificacao());
		
	}
}
