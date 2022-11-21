import java.util.Scanner;
public class MediaPreco {
	public static void main(String[] args) {
			
			Scanner leitura = new Scanner(System.in);
		
					int resposta;
					double preco, lucro, ven;

			        do{
			        	System.out.println("Digite o valor do produto:");
			            preco = leitura.nextDouble();

			            System.out.println("Digite a margem de lucro do produto em porcentagem:");
			            lucro = leitura.nextDouble();

			            ven = ((lucro / 100) * preco) + preco;
			            System.out.println("O produto foi vendido por: R$" + ven);

			            System.out.println("Deseja continuar a execução? 1- Sim 2- Não ");
			            resposta = leitura.nextInt();
			        }while (resposta!=2);
	      }
		
	}



