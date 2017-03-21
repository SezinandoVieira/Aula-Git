package br.cesed.si.p3.rms;

import br.cesed.si.p3.rms.Enums.MarcaCarro;

public final class CarroRMS {

	private String placa;
	private String cor;
	private String modelo;
	private String fabricante;
	private MarcaCarro marca;

	public CarroRMS(String placa, String cor, String modelo, String fabricante, MarcaCarro marca) {
		super();
		this.placa = placa;
		this.cor = cor;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.marca = marca;
	}

	/**
	 * @return the placa
	 */
	public String getPlaca() {
		return placa;
	}

	/**
	 * @param placa the placa to set
	 */
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	/**
	 * @return the cor
	 */
	public String getCor() {
		return cor;
	}

	/**
	 * @param cor the cor to set
	 */
	public void setCor(String cor) {
		this.cor = cor;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the fabricante
	 */
	public String getFabricante() {
		return fabricante;
	}

	/**
	 * @param fabricante the fabricante to set
	 */
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	/**
	 * @return the marca
	 */
	public MarcaCarro getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(MarcaCarro marca) {
		this.marca = marca;
	}
	
}
