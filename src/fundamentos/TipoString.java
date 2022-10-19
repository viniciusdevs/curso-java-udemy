package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		System.out.println("Ola pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!")); // juntou "!!!" na frase
		System.out.println(s + "!!!"); // juntou "!!!" na frase de outra maneira
		System.out.println(s.startsWith("Boa")); // quer saber se tem "Boa" na frase (true ou false) TRUE
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		String maisUmaFrase = "Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario + "\n\n";
		System.out.println(maisUmaFrase);
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario);
		
		System.out.printf("Nome: O senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nNome: O senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 10));
	}
}
