package controle_atendimento_de_pacientes;

import java.util.List;

public class Executor {

	public static void main(String[] args) {
		BaseDados db = new BaseDados();
		// lista paciente e suas caracteristicas
		List<Paciente> pacientes = db.pacientes();
		 System.out.println("Lista de pacientes:");
	        for (int i = 0; i < pacientes.size(); i++) {
	            Paciente paciente = pacientes.get(i);
	            System.out.println("Paciente " + (i + 1) + ":");
	            Impressao.imprimirListaPacientes(pacientes);
	        }
	   // lista de exames e suas caracteristicas
	        List<Exame> exames = db.exames();
			 System.out.println("Lista de exames:");
		        for (int i = 0; i < exames.size(); i++) {
		            Exame exame = exames.get(i);
		            System.out.println("Exame " + (i + 1) + ":");
		            Impressao.imprimirListaExames(exames);
		        }
	}

}
