package controle_atendimento_de_pacientes;

import java.util.List;

public class Impressao {
	public static void imprimirListaPacientes(List<Paciente> pacientes) {
        for (Paciente paciente : pacientes) {
            System.out.println("Identificador: " + paciente.getIdentificador());
            System.out.println("Nome: " + paciente.getNome());
            System.out.println("Contato: " + paciente.getContato());
            System.out.println("Situacao: " + paciente.getSituacao());

            Endereco endereco = paciente.getEndereco();
            if (endereco != null) {
                System.out.println("Endereco do paciente:");
                System.out.println("Rua: " + endereco.getRua());
                System.out.println("Cidade: " + endereco.getCidade());
                System.out.println("Estado: " + endereco.getEstado());
                System.out.println("Bairro: " + endereco.getBairro());
                System.out.println("CEP: " + endereco.getCep());
            }

            System.out.println("--------------------------------------");
        }
    }
	public static void imprimirListaExames(List<Exame> exames) {
        for (Exame exame : exames) {
            System.out.println("Identificador: " + exame.getIdentificador());
            System.out.println("Nome: " + exame.getNome());
            System.out.println("Descricao do exame: " + exame.getDescricaoExame());
            System.out.println("Observação: " + exame.getObservacao());
            System.out.println("Categoria: " + exame.getCategoria());
            System.out.println("Data do cadastro: " + exame.getDataDoCadastro());
            System.out.println("Situacao: " + exame.getSituacao());

            System.out.println("--------------------------------------");
        }
    }
}
