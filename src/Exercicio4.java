import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//		hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//		decimais.
		
		int numfunc;
		double numhoras, valor, salario;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("insira o numero do funcionário");
		numfunc = sc.nextInt();
		System.out.println("insira o numero de horas trabalhadas");
		numhoras = sc.nextDouble();
		System.out.println("insira o valor que recebe por hora");
		valor = sc.nextDouble();
		
		salario = valor*numhoras;
		
		System.out.printf("O salário do funcionário "+numfunc+" é : R$ %.2f%n", salario);
		
		sc.close();
	}

}
