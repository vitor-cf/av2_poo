package controle_atendimento_de_pacientes;

import java.util.Date;
import java.util.List;

public class Paciente {
	private int identificador;
	private String nome;
	private String contato;
	private Endereco endereco;
	private Date dataDoCadastro;
	private String situacao; 
	
		
	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Date getDataDoCadastro() {
		return dataDoCadastro;
	}

	public void setDataDoCadastro(Date dataDoCadastro) {
		this.dataDoCadastro = dataDoCadastro;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	
	
	
	// Metodo para pegar o endereco 
	public String enderecoCompleto() {
		String enderecoPessoa;
		enderecoPessoa = endereco.getRua() + ", " + endereco.getBairro() + ", "
                + endereco.getCidade() + " - " + endereco.getEstado() + ", " + endereco.getCep();
		
		return enderecoPessoa;
	}
	
}
