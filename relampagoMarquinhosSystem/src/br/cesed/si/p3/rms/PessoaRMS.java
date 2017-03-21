package br.cesed.si.p3.rms;

/**
 * @author Sezinando Vieira e Jefferson Miranda 
 * 
 * Classe pai, que serve de modelo para as classes Cliente e Funcionario
 *
 */
public abstract class PessoaRMS implements IdentificavelRMS{

	 private String nome;
	 private byte idade;
	 private short cpf;
	 private EnderecoRMS endereco;

	public PessoaRMS(String nome, byte idade, short cpf, EnderecoRMS endereco) {
		this(nome,idade,cpf);
		this.endereco = endereco;
	}
	
	public PessoaRMS(String nome, byte idade, short cpf) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
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

	/**
	 * @return the endereco
	 */
	public EnderecoRMS getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(EnderecoRMS endereco) {
		this.endereco = endereco;
	}
}
