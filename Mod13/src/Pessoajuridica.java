


public class Pessoajuridica extends Pessoa{
	
	private static final String[] RAMOS_ATIVIDADE = {"Tecnologia da Informação", "Marketing", "Consultoria Empresarial", "Educação", "Saúde"};
    private static final String[] NOMES = {"Tech", "Digital", "Consult", "Educa", "Health"};
    private static final String[] SOBRENOMES = {"Solutions", "Marketing", "Consulting", "Cursos", "Clinic"};
    private static final String[] DOMINIOS_EMAIL = {"@gmail.com", "@outlook.com", "@yahoo.com", "@hotmail.com"};
	
	public String ramoAtividade() {
		String ramoatividade = RAMOS_ATIVIDADE[rd.nextInt(RAMOS_ATIVIDADE.length)];
		return ramoatividade;
	}
	
	public String nomeEmpresa() {
		String nomeempresa= NOMES[rd.nextInt(NOMES.length)];
		String sobrenomeempresa= SOBRENOMES[rd.nextInt(SOBRENOMES.length)];
		return nomeempresa + " "+ sobrenomeempresa;
		
	}
	
	
	public String emailEmpresa() {
		String email = DOMINIOS_EMAIL[rd.nextInt(DOMINIOS_EMAIL.length)];
		String nomeempresa= NOMES[rd.nextInt(NOMES.length)];
		String sobrenomeempresa= SOBRENOMES[rd.nextInt(SOBRENOMES.length)];
		String emaill = nomeempresa+sobrenomeempresa+email;
		return emaill;
	}
}
