package entities;

public class Cliente { 
	
	private String nome;     
	private String email;     
	private int cel;     
	private int idade;
	private int cnh;     
	private int cpf;          
	
	public Cliente(String nome, String email, int cel, int idade, int cnh, int cpf) {         
		this.nome = nome;         
		this.email = email;         
		this.cel = cel;         
		this.idade = idade;         
		this.cnh = cnh; 
		this.cpf = cpf;    
	}                         
	
	public String getNome() {         
		return nome;     
	}      
	
	public void setNome(String nome) {         
		this.nome = nome;     
	}      
	
	public String getEmail() {         
		return email;     
	}      
	
	public void setEmail(String email) {         
		this.email = email;     
	}      
	
	public int getCel() {         
		return cel;     
	}      
	
	public void setCel(int cel) {         
		this.cel = cel;     
	}      
	
	public int getCnh() {         
		return cnh;     
	}      
	
	public void setCnh(int cnh) {         
		this.cnh = cnh;     
	}      
	
	public int getIdade() {         
		return idade;     
	}      
	
	public void setIdade(int idade) {         
		this.idade = idade;     
	}
	
	public int getCpf() {         
		return cpf;     
	}      
	
	public void setCpf(int cpf) {         
		this.cpf = cpf;     
	} 


	@Override
	public String toString() {
		return "{" +
			" nome='" + getNome() + "'" +
			", email='" + getEmail() + "'" +
			", cel='" + getCel() + "'" +
			", idade='" + getIdade() + "'" +
			", cnh='" + getCnh() + "'" +
			", cpf='" + getCpf() + "'" +
			"}";
	}

}