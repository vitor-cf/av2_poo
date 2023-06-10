package controle_atendimento_de_pacientes;

import java.util.Date;

public class Exames {
	private int identificador;
	private String nome;
	private String descricaoExame;
	private String observacao;
	private String categoria;
	private Date dataDoCadastro;
	private String situacao;
	
	public Exames (int identificador, String nome, String descricaoExame, String observacao, String categoria, Date dataDoCadastro, String situacao) {
		this.identificador = identificador;
		this.nome = nome;
		this.descricaoExame = descricaoExame;
		this.observacao = observacao;
		this.categoria = categoria;
		this.dataDoCadastro = dataDoCadastro;
		this.situacao = situacao;
	}
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
	public String getDescricaoExame() {
		return descricaoExame;
	}
	public void setDescricaoExame(String descricaoExame) {
		this.descricaoExame = descricaoExame;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
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
	
}
