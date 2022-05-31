
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 100.00;

		System.out.println(primeiraConta.saldo);

		primeiraConta.saldo += 100.00;
		System.out.println(primeiraConta.saldo);

		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		Conta terceiraConta = new Conta();

		System.out.println("Primeira conta tem: " + primeiraConta.saldo);
		System.out.println("Segunda conta tem: " + segundaConta.saldo);
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.titular);
		System.out.println(terceiraConta.numero);

		System.out.println(segundaConta.agencia);

		segundaConta.agencia = 442;
		System.out.println(segundaConta.agencia);

		if (primeiraConta == segundaConta) {
			System.out.println("Mesma conta");
		} else {
			System.out.println("Conta diferente");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);

	}
}
