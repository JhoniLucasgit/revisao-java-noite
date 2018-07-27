package exemplo2;

public class TestaContaCorrente {
	
	public static void main(String[] args) {
		
		Cliente natan = new Cliente("Natan", "123.456.789.12", 25);
		ContaCorrente contaNatan = new ContaCorrente();
		contaNatan.setCliente(natan);
		contaNatan.setAgencia("1234-5");
		contaNatan.setNumero("123-2");
		contaNatan.setLimite(1000f);
		contaNatan.setSaldo(2000f);
		
		Cliente jackson = new Cliente("Jackson", "987.654.321-98", 43);
		ContaCorrente contaJackson = new ContaCorrente();
		contaJackson.setCliente(jackson);
		contaJackson.setAgencia("9876-5");
		contaJackson.setNumero("987-2");
		contaJackson.setLimite(500f);
		contaJackson.setSaldo(3000f);
				
//		contaNatan.deposita(600f);
//		contaJackson.saca(500f);
		
		contaJackson.transfere(250f, contaNatan);
//		contaJackson.transfere(250f, contaNatan);
		
		System.out.println(contaNatan);
		System.out.println(contaJackson);
		
		contaJackson.transfere(3200f, contaNatan);
		
		System.out.println(" ");
		System.out.println(contaNatan);
		System.out.println(contaJackson);
		
		
	}
}
