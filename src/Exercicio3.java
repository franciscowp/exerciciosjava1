import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//		de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		
		int A, B, C, D, dif;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("insira o valor de A");
		A = sc.nextInt();
		System.out.println("insira o valor de B");
		B = sc.nextInt();
		System.out.println("insira o valor de C");
		C = sc.nextInt();
		System.out.println("insira o valor de D");
		D = sc.nextInt();
		
		dif = (A * B - C * D);
		
		System.out.println("A diferença é: " + dif);
		sc.close();
	}

}
