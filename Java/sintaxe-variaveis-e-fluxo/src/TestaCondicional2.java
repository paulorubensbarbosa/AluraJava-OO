
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("Testando Condicionais");

		int idade = 20;
		int quantidadePessoas = 2;
		boolean acompanhado = quantidadePessoas >= 2;

		System.out.println("Valor acompanhado = " + acompanhado);
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente voc� n�o pode entrar");
		}

	}
}
