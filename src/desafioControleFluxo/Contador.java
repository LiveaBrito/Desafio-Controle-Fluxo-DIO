package desafioControleFluxo;

import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
	public ParametrosInvalidosException(String mensagem) {
		super(mensagem);
	}
}

public class Contador {

	public static void main(String[] args) {
		
		Scanner terminal = new Scanner(System.in);
		
		System.out.println("****Controle de Fluxo****");
		System.out.println();
		
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		int param = parametroDois - parametroUm;
		
		System.out.println();
		System.out.println("O parâmetro é = " + parametroDois + " - " + parametroUm + " = " + param);
		System.out.println();

		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			System.err.println("Erro: " + exception.getMessage());
		
		}
		
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroDois <= parametroUm) {
			throw new ParametrosInvalidosException ("O segundo parâmetro deve ser maior que o primeiro.");
		}
		
		int contagem = parametroDois - parametroUm;
		for(int contador = 1; contador <= contagem; contador++) {
			System.out.println("Imprimindo o numero: " + contador);
		}
		
		System.out.println();
		System.out.println("Programa Finalizado!");
	}
	
}

	
	
