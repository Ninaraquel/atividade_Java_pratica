package exercicio;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float salario;
		float abono;
		float novoSalario;
		
		System.out.print("Digite o salário:");
		salario = leia.nextFloat();
		
		System.out.print("Digite o abono:");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.print("Novo Salário:" + novoSalario);

	}

}
