package oo.encapsulamento;

public class Pessoa {
	private String nome;
	private int idade;
	private String sobrenome;
	
	
	public Pessoa(String nome,String sobrenome, int idade) {
		setNome(nome);
		setSobrenome(sobrenome);
		setIdade(idade);
	}
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public int getIdade() {
		return idade;
	}
	
	public String nomeCompleto() {
		return getNome() + " " + getSobrenome();
	}
	
	
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >= 0 && novaIdade <= 120) {
		this.idade = novaIdade;
		
		}
	}
		
		public String toString() {
			return "ola eu sou o " + getNome() + ", e minha idade é " + getIdade();
		}
		
	}

