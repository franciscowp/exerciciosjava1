import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//		casas decimais conforme exemplos.
//		Fórmula da área: area = π . raio2
//		Considere o valor de π = 3.14159
		Scanner sc = new Scanner(System.in);
		double area, raio;
		System.out.println("insira o valor do raio");
		raio = sc.nextDouble();
		area = 3.14159*(raio *raio);
		System.out.println("o valor da area do círculo é: "+ area);
		sc.close();
	}

}
