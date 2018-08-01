package exemplo2;

public class TestaCliente {

	public static void main(String[] args) {
		Cliente natan = new Cliente();
		natan.setNome("Natan");
		System.out.println(natan.getNome());
		
		int resultado = subtrair("sobrinho", "5");
		
		System.out.println(resultado);
	}
	
	public static int subtrair(String n1, String n2) {
		try {
			return Integer.parseInt(n1) - Integer.parseInt(n2);
		}catch(NumberFormatException ex){// exceção para valores que não tem o formato de um número
			System.out.println("Não pode ser texto \n"+ex);
		}
		return 0;
	}
}
 