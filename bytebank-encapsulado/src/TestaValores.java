
public class TestaValores {

	public static void main(String[] args) {
		
		
		Conta conta = new Conta(1337, 24226);
		Conta conta2 = new Conta(1337, 14569);
		Conta conta3 = new Conta(1337, 14330);
		
		
		System.out.println(conta.getAgencia());
		 
		System.out.println(Conta.getTotal());
		
	}
}
