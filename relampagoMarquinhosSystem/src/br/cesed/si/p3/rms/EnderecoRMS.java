package br.cesed.si.p3.rms;

public class EnderecoRMS {

	protected String nomeRua;
	protected short cep;
	protected String complemento;
	protected String bairro;
	protected String numero;
	
	public EnderecoRMS(String nomeRua, short cep, String complemento, String bairro, String numero) {
		super();
		this.nomeRua = nomeRua;
		this.cep = cep;
		this.complemento = complemento;
		this.bairro = bairro;
		this.numero = numero;
	}

	/**
	 * @return the nomeRua
	 */
	public String getNomeRua() {
		return nomeRua;
	}

	/**
	 * @param nomeRua the nomeRua to set
	 */
	public void setNomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}

	/**
	 * @return the cep
	 */
	public short getCep() {
		return cep;
	}

	/**
	 * @param cep the cep to set
	 */
	public void setCep(short cep) {
		this.cep = cep;
	}

	/**
	 * @return the complemento
	 */
	public String getComplemento() {
		return complemento;
	}

	/**
	 * @param complemento the complemento to set
	 */
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	/**
	 * @return the bairro
	 */
	public String getBairro() {
		return bairro;
	}

	/**
	 * @param bairro the bairro to set
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	
}
