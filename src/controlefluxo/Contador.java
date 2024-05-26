package controlefluxo;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = scanner.nextInt();
		
		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = scanner.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
		
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

		int contagem = parametroDois - parametroUm;
		
		if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("\nO segundo parâmetro deve ser maior que o primeiro");
        }
		
		for (int i = 1; i <= contagem; i++) {
            System.out.println("\nImprimindo o número: " + i);
        }
	}
}