package infnet.model.domain;

public class Cliente {
	private Integer id;
	private String nome;
	private String endereco;
	private String telefone;
	private String email;
	
	
		
	public void impressao() {
		System.out.println(this);		
	}
	
	
	@Override
	public String toString() {
		return String.format("O usuario [%s] foi cadastrado com sucesso!", nome, email);
	}

	public Cliente() {
		
	}
	public Cliente(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
		
}
