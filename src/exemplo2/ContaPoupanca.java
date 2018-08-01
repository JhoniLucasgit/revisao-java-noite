package exemplo2;

public class ContaPoupanca extends Conta{
	
	private final Float RENDIMENTO = 0.01f;

	@Override
	Boolean saca(Float valor) {
		if(valor > 0 && super.getSaldo() >= valor) {
			super.setSaldo(super.getSaldo() - valor);
			return true;
		}
		return false;
	}
	
//  Outro meio de fazer o método saca 
//
//	Boolean saca(Float valor) {
//		Float saldo = super.getSaldo();
//		if(valor > 0 && saldo >= valor) {
//			super.setSaldo(saldo - valor);
//			return true;
//		}
//		return false;
//	}
	
	
	//como os valores de get e set não são de ContaPolpança deve colocar o super para refenrenciar o metodo da classe pai
	public void rende() {
		Float novoSaldo = super.getSaldo() + super.getSaldo() * RENDIMENTO;
		super.setSaldo(novoSaldo);
	}
	
	@Override
	public String toString() {
		return "ContaPoupança[conta=" + super.toString() + "]";
		
	}

}
