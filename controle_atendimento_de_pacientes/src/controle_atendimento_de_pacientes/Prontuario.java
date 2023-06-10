package controle_atendimento_de_pacientes;

import java.util.Date;
import java.util.List;

public class Prontuario {
	private int identificador;
	private Paciente paciente;
    private ProfissionalDeSaude profissionalDeSaude;
    private String descricaoAtendimento;
    private String tratamentoSugerido;
    private List<Exame> examesSolicitados;
    private String observacoes;
    private Date dataDoCadastro;
    private String situacao;
    // Construtor
    public Prontuario(int identificador, Paciente paciente, ProfissionalDeSaude profissionalDeSaude,
            String descricaoAtendimento, String tratamentoSugerido, List<Exame> examesSolicitados,
            String observacoes) {
this.identificador = identificador;
this.paciente = paciente;
this.profissionalDeSaude = profissionalDeSaude;
this.descricaoAtendimento = descricaoAtendimento;
this.tratamentoSugerido = tratamentoSugerido;
this.examesSolicitados = examesSolicitados;
this.observacoes = observacoes;
this.dataDoCadastro = new Date();
this.situacao = situacao;
}
    public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public ProfissionalDeSaude getProfissionalDeSaude() {
		return profissionalDeSaude;
	}

	public void setProfissionalDeSaude(ProfissionalDeSaude profissionalDeSaude) {
		this.profissionalDeSaude = profissionalDeSaude;
	}

	public String getDescricaoAtendimento() {
		return descricaoAtendimento;
	}

	public void setDescricaoAtendimento(String descricaoAtendimento) {
		this.descricaoAtendimento = descricaoAtendimento;
	}

	public String getTratamentoSugerido() {
		return tratamentoSugerido;
	}

	public void setTratamentoSugerido(String tratamentoSugerido) {
		this.tratamentoSugerido = tratamentoSugerido;
	}

	public List<Exame> getExamesSolicitados() {
		return examesSolicitados;
	}

	public void setExamesSolicitados(List<Exame> examesSolicitados) {
		this.examesSolicitados = examesSolicitados;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
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
