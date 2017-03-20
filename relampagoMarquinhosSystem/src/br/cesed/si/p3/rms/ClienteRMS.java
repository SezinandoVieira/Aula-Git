package br.cesed.si.p3.rms;

public final class ClienteRMS extends PessoaRMS {

	private int codigoCliente;

	public ClienteRMS(String nome, byte idade, short cpf, int codigoCliente) {
		super(nome, idade, cpf);
		this.codigoCliente = codigoCliente;
	}

	/**
	 * @return the codigoCliente
	 */
	public int getCodigoCliente() {
		return codigoCliente;
	}

	/**
	 * @param codigoCliente the codigoCliente to set
	 */
	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	
	
	

}
