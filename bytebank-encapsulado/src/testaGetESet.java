
public class testaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24336);
		
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		
		Cliente paulo = new Cliente();
		
		paulo.setNome("Paulo Rubens");
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		System.out.println(conta.getTitular().getProfissao());
		
	}
}
