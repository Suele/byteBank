package bytebank.heranca;

public class TestFuncionario {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();

		funcionario.setNome("Maria");
		funcionario.setSalario(2500.00);
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getBonificacao());
	}
}
