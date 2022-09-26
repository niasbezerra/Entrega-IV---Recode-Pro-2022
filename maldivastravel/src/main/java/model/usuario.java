package model;

public class usuario {

	
	private int idcliente;
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
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
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getDestino_interesse() {
		return destino_interesse;
	}
	public void setDestino_interesse(String destino_interesse) {
		this.destino_interesse = destino_interesse;
	}
	private String nome;
	private String email;
	private String senha;
	private String destino_interesse;
		
}

