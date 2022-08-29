package aplicacao;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluno estud = new Aluno();
        System.out.println("Nome do Aluno:");
		estud.nome = sc.nextLine();
		System.out.println("Nota1:");
		estud.nota1 = sc.nextDouble();
		System.out.println("Nota:2");
		estud.nota2 = sc.nextDouble();
		System.out.println("Nota3:");
		estud.nota3 = sc.nextDouble();

		System.out.printf("Nota final: %.2f%n", estud.notaFinal());

		if (estud.notaFinal() < 60.0) {
			System.out.println("Reprovado");
			System.out.printf("Faltando %.2f Pontos %n", estud.faltandoPontos());
		} else {
			System.out.println("Aprovado!!!");
		}
		sc.close();
	

	}

}
