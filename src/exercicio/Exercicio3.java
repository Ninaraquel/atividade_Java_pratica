package exercicio;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.print("Salário Bruto:");
		salarioBruto = leitor.nextFloat();
		
		System.out.print("Adicional Noturno:");
		adicionalNoturno = leitor.nextFloat();
		
		System.out.print("Horas Extras:");
		horasExtras = leitor.nextFloat();
		
		System.out.print("Descontos:");
		descontos = leitor.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.println("Salário Líquido:" + salarioLiquido);
		
	}

}
