import java.util.Scanner;
public class Baskara {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		double a, b, c, delta, x1, x2;
		System.out.println("Digite o valor de a: ");
		a = leitura.nextDouble();
		System.out.println("Digite o valor de b: ");
		b = leitura.nextDouble();
		System.out.println("Digite o valor de c: ");
		c = leitura.nextDouble();
		delta = (b*b)-4*a*c;
		System.out.println("Delta = "+delta);
		if (delta<0) {
			System.out.println("N�o existe ra�zes reais para essa equa��o");
		}else if (delta==0) { 
			x1 = -b/(2*a);
			System.out.println("H� uma raiz real, que �: "+x1);
		}else {
			x1 = (-b+Math.sqrt(delta))/ (2*a);
			x2 = (-b-Math.sqrt(delta))/ (2*a);
			System.out.println("Existem duas ra�zes = "+x1+" e "+x2);
		}
	}
	
}
