package exemplo2;

public class ContaCorrente extends Conta{
	
	private Float limite;
	private Float tarifa;
	
	public ContaCorrente () {}
	
	public ContaCorrente (Cliente cliente, String agencia, String numero, Float saldo, Float limite) {
		super(cliente, agencia, numero, saldo);
		this.limite = limite;
	}

	public Float getLimite() {
		return limite;
	}

	public void setLimite(Float limite) {
		this.limite = limite;
	}

	public Float getTarifa() {
		return tarifa;
	}

	public void setTarifa(Float tarifa) {
		this.tarifa = tarifa;
	}

	@Override
	public String toString() {
		return "ContaCorrente [conta=" + super.toString() + ", limite=" + limite + ", tarifa=" + tarifa + "]";
		
	}
	
	@Override
	public Boolean saca(Float valor) {
		Float saldoVirtual = super.getSaldo() + this.limite;
		if(valor > 0 && saldoVirtual > valor) {
			Float novoSaldo = super.getSaldo() - valor;
			super.setSaldo(novoSaldo);
			return true;
		}
		return false;
	}
	
	
}
