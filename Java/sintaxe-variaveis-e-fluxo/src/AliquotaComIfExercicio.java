
public class AliquotaComIfExercicio {
	public static void main(String[] args) {

		double salario = 3300.0;

		if (salario >= 1900 && salario <= 2800) {
			System.out.println("o IR � de 7.5%");
		} else if (salario >= 2800.01 && salario <= 3751) {
			System.out.println("o IR � de 15%");
		} else if (salario >= 3751.01 && salario <= 4664) {
			System.out.println("o IR � de 22.5%");
		}

	}
}
