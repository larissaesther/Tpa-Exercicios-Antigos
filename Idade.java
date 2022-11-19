import java.util.Scanner;
import java.util.Scanner;
public class Idade {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int a, n, i;
		System.out.println("Digite o ano atual:");
		a = in.nextInt();
		System.out.println("Digite seu ano de nascimento:");
		n = in.nextInt();
		i = a - n;
		System.out.println("Sua idade é " + i);
		if (i<=10) {
			System.out.println("Criança");
		}else  if (i<=18) {
			System.out.println("Adolescente");
		}else if (i<60) {
			System.out.println("Adulto");
		}else{
			System.out.println("Idoso");
		}
	}
}
