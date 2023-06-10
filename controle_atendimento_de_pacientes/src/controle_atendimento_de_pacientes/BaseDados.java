package controle_atendimento_de_pacientes;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseDados {
	public List<Paciente> pacientes() {
		List<Paciente> pacientes = new ArrayList<Paciente>();
		Paciente paciente;
		
		// Paciente
		// Endereco do paciente 
		Endereco endereco = new Endereco();
		endereco.setCep(41610430);
		endereco.setRua("Rua do Tamarineiro");
		endereco.setCidade("Salvador");
		endereco.setEstado("Bahia");
		endereco.setBairro("Itapua");
		
		paciente = new Paciente();
		paciente.setIdentificador(1);
		paciente.setNome("Vitor Ferreira");
		paciente.setContato("991182502");
		paciente.setSituacao("Ativo");
		paciente.setEndereco(endereco);
		pacientes.add(paciente);
		return pacientes;
	}
	public List<Exame> exames() {
		List<Exame> exames = new ArrayList<Exame>();
		Exame exame;
		//Exame
		exame = new Exame();
		exame.setIdentificador(1);
		exame.setNome("Hemograma");
		exame.setDescricaoExame("O exame analisa informações específicas sobre os tipos e "
				+ "quantidades dos componentes no sangue");
		exame.setObservacao("Em jejum por 5 horas antes do exame");
		exame.setCategoria("Laboratorial");
		exame.setDataDoCadastro(new Date());
		exame.setSituacao("Ativo");
		exames.add(exame);
		return exames;
	}
}
