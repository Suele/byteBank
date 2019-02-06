package bytebank.heranca;

public class TestGerente {

	public static void main(String[] args) {

		Gerente gerente = new Gerente();

		gerente.setNome("Maria da Silva");
		gerente.setSalario(3000.00);
		gerente.setSenha(12345);

		System.out.println(gerente.getNome());
		System.out.println(gerente.getSalario());
		System.out.println(gerente.autentica(12345));
	}
}
