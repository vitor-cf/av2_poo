package controle_atendimento_de_pacientes;
import java.util.ArrayList;
import java.util.List;

public class BaseDados {
	public List<Especialidade> especialidades() {
		List<Especialidade> especialidades = new ArrayList<Especialidade>();
		Especialidade especialidade;
		
		especialidade = new Especialidade();
		especialidade.setNome("Geriatria");
		especialidades.add(especialidade);
		
		return especialidades;
	}
}
