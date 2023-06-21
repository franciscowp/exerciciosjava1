import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A, B, soma;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o valor de A:");
		A = sc.nextInt();
		System.out.println("Insira o valor de B:");
		B = sc.nextInt();
		soma = A + B;
		System.out.println("SOMA = " + soma);
		sc.close();
	}

}
