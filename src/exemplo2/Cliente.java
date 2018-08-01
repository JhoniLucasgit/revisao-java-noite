package exemplo2;

public class Cliente implements PersistDB, Repositorio{
	
	private Integer id;
	private String nome;
	private String cpf;
	private Integer idade;
	
	public Cliente() {}

	public Cliente(String nome) {
		this.nome = nome;
	}

	public Cliente(String nome, String cpf, Integer idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + "]";
	}

	@Override
	public void salva(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void edita(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
