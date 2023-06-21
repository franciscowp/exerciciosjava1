import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//		código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
		
		Scanner sc = new Scanner(System.in);
		int C1, C2, Q1, Q2;
		double V1, V2, valor;
		
		System.out.println("insira o código da peça 1:");
		C1 = sc.nextInt();
		System.out.println("insira o número de peças 1:");
		Q1 = sc.nextInt();
		System.out.println("insira valor da peça 1:");
		V1 = sc.nextDouble();
		
		System.out.println("insira o código da peça 2:");
		C2 = sc.nextInt();
		System.out.println("insira o número de peças 2:");
		Q2 = sc.nextInt();
		System.out.println("insira valor da peça 2:");
		V2 = sc.nextDouble();
		
		valor = (Q1*V1) + (Q2*V2);
		
		System.out.printf("O valor total é R$ %.2f%n", valor);
		sc.close();
	}

}
