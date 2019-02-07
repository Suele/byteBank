package bytebank.heranca;

public class TestDiretor {

	public static void main(String[] args) {
		
		Diretor diretor = new Diretor();
		
		diretor.setNome("Maria");
		
		diretor.setSalario(10000.0);
		
		System.out.println(diretor.getBonificacao());
	}
}
