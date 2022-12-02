import java.util.Scanner;
public class Salario {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double salario, debts=0;
		System.out.println("Digite seu salário: ");
		salario =  in.nextInt();
		debts = salario * 0.3;
		System.out.println("O valor máximo que vc tem que pagar é: "+debts);
	}
}
