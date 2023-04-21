import java.util.Random;
/**
 * @author Vitorepf
 *
 */
public abstract class Pessoa {
	String pessoa;
	
	private static final String[] NOMES = {"Lucas", "Mariana", "Gabriel", "Isabela", "Rafael", "Fernanda", "Pedro", "Ana", "João", "Carla"};
    private static final String[] SOBRENOMES = {"Silva", "Santos", "Souza", "Pereira", "Oliveira", "Ferreira", "Lima", "Almeida", "Rodrigues", "Costa"};
    private static final String[] ENDERECOS = {"Rua A", "Rua B", "Rua C", "Rua D", "Rua E", "Rua F"};
    private static final String[] TELEFONES = {"(11) 1234-5678", "(21) 2345-6789", "(31) 3456-7890", "(41) 4567-8901", "(51) 5678-9012"};
    
    Random rd = new Random();
	
	public String gerarNome() {
		
		String nome = NOMES[rd.nextInt(NOMES.length)];
        String sobrenome = SOBRENOMES[rd.nextInt(SOBRENOMES.length)];
		return nome+" "+ sobrenome;
	}
	
	public String gerarEndereco() {
		
		String endereco = ENDERECOS[rd.nextInt(ENDERECOS.length)];
		return endereco;
	}
	
	public String gerarTelefone() {
		String telefone = TELEFONES[rd.nextInt(TELEFONES.length)];
		return telefone;
	}
}
