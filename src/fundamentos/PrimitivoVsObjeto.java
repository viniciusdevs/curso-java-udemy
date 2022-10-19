package fundamentos;

public class PrimitivoVsObjeto {
	
	public static void main(String[] args) {
		
		String s = new String("texto");
		s.toUpperCase();
		System.out.println(s);
		
		//Wrappers sao a versao objeto dos tipos primitivos
		int a = 123;
		System.out.println(a);
	}

}
