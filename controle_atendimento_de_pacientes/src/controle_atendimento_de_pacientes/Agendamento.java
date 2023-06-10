package controle_atendimento_de_pacientes;

import java.util.Date;

public class Agendamento {
	private int identificador;
	private Paciente paciente;
    private String especialidade;
    private ProfissionalDeSaude profissionalDeSaude;
    private String tipoAtendimento;
    private String convenioParticular;
    private Date dataAtendimento;
    private String local;
    private String situacao;
    
 // Construtor
    public Agendamento(int identificador, Paciente paciente, String especialidade,
                       ProfissionalDeSaude profissionalSaude, String tipoAtendimento,
                       String convenioParticular, Date dataAtendimento, String local, String situacao, ProfissionalDeSaude profissionalDeSaude) {
        this.identificador = identificador;
        this.paciente = paciente;
        this.especialidade = especialidade;
        this.profissionalDeSaude = profissionalDeSaude;
        this.tipoAtendimento = tipoAtendimento;
        this.convenioParticular = convenioParticular;
        this.dataAtendimento = dataAtendimento;
        this.local = local;
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

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public ProfissionalDeSaude getProfissionalDeSaude() {
		return profissionalDeSaude;
	}

	public void setProfissionalDeSaude(ProfissionalDeSaude profissionalDeSaude) {
		this.profissionalDeSaude = profissionalDeSaude;
	}

	public String getTipoAtendimento() {
		return tipoAtendimento;
	}

	public void setTipoAtendimento(String tipoAtendimento) {
		this.tipoAtendimento = tipoAtendimento;
	}

	public String getConvenioParticular() {
		return convenioParticular;
	}

	public void setConvenioParticular(String convenioParticular) {
		this.convenioParticular = convenioParticular;
	}

	public Date getDataAtendimento() {
		return dataAtendimento;
	}

	public void setDataAtendimento(Date dataAtendimento) {
		this.dataAtendimento = dataAtendimento;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	
    
 
}
