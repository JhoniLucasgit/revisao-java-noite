package exemplo2;

public abstract class Conta implements PersistDB{

	private Integer id;
	private Cliente cliente;
	private String agencia;
	private String numero;
	private Float saldo;
	private static Integer quantidade = 0;
		
	public Conta() {
		Conta.quantidade++;
	}
	
	public Conta(Cliente cliente, String agencia, String numero, Float saldo) {
		this.cliente = cliente;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
		Conta.quantidade++;
	}

	public static Integer getQuantidade() {
		return Conta.quantidade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Float getSaldo() {
		return saldo;
	}

	public void setSaldo(Float saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (agencia == null) {
			if (other.agencia != null)
				return false;
		} else if (!agencia.equals(other.agencia))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Conta [cliente=" + cliente + ", agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + "]";
	}
	
//	public Boolean saca(Float valor) {
//		if(valor > 0 && this.saldo >= valor) {
//			this.saldo -= valor;
//			return true;
//		}
//		return false;
//	}
	
	abstract Boolean saca(Float valor); 
	
	public Boolean deposita(Float valor) {
		if(valor > 0) {
			this.saldo += valor;
			return true;
		}
		return false;
	}
	
	public Boolean transfere(Float valor, Conta contaDestino) {
//		Conta contaOrigem = this;
		if(this.saca(valor)) {
			contaDestino.deposita(valor);			
			return true;
		}
		return false;
	}
}
