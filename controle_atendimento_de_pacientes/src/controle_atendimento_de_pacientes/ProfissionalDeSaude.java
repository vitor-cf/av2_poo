package controle_atendimento_de_pacientes;

import java.util.Date;
import java.util.List;

public class ProfissionalDeSaude {
	private int identificador;
	private String nome;
	private String tipo;
	private List<String> especialidades;
	private Date dataDoCadastro;
	private String situacao;
	
	// Construtor
		public ProfissionalDeSaude(int identificador, String nome, String tipo, List<String> especialidades, Date dataDoCadastro, String situacao) {
			this.identificador = identificador;
	        this.nome = nome;
	        this.tipo = tipo;
	        this.especialidades = especialidades;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<String> getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(List<String> especialidades) {
		this.especialidades = especialidades;
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
