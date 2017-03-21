package br.cesed.si.p3.rms;

public class FuncionarioRMS extends PessoaRMS{

	private int codigoFuncionario;

	public FuncionarioRMS(String nome, byte idade, short cpf, int codigoFuncionario) {
		super(nome, idade, cpf);
		this.codigoFuncionario = codigoFuncionario;
	}
/**
 * Classe responsável por construir o objeto do tipo Funcionario que herda da classe pessoa
 */
	public FuncionarioRMS(String nome, byte idade, short cpf, EnderecoRMS endereco, int codigoFuncionario) {
		super(nome, idade, cpf, endereco);
		this.codigoFuncionario = codigoFuncionario;
	}

	/* (non-Javadoc)
	 * subscreve o metodo getId
	 */
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return codigoFuncionario;
	}
	
	
	
	
	
	
	

	
	
	
}
