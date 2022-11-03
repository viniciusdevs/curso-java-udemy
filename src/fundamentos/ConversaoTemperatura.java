package fundamentos;

import java.util.Scanner;

public class ConversaoTemperatura {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		double celsius = entrada.nextDouble();
		
		double conversao = ( celsius - 32 ) / 1.8;
		
		System.out.println("Valor em Farenheit: " + conversao);
		
		entrada.close();
	}

}
