package br.cesed.si.p3.rms;

public abstract class PessoaRMS {

	/**
	 * @author Sezinando Vieira e Jefferson Miranda 
	 *
	 */
	
	 protected String nome;
	 protected byte idade;
	 protected short cpf;
	 protected EnderecoRMS endereco;
	
	 public PessoaRMS(String nome, byte idade, short cpf) {
		
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}
	 
	 

	public PessoaRMS(EnderecoRMS endereco) {
		super();
		this.endereco = endereco;
	}



	/**
	 * @return o nome da pessoa
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * estabelece o nome da pessoa
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return a idade
	 */
	public byte getIdade() {
		return idade;
	}

	/**
	 * estabelece a idade
	 */
	public void setIdade(byte idade) {
		this.idade = idade;
	}

	/**
	 * @return o cpf
	 */
	public short getCpf() {
		return cpf;
	}

	/**
	 * estabelece o cpf
	 */
	public void setCpf(short cpf) {
		this.cpf = cpf;
	}
	 
	 
	 
}
