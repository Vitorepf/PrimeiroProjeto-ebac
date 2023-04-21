import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class GerarP extends Pessoa{
	
	List<String> pessoaf = new ArrayList<>();
	List<String> pessoaj = new ArrayList<>();
	
	public PessoaFisica pf = new PessoaFisica();
	public Pessoajuridica pj = new Pessoajuridica();
	
	public void CriarPF() {
		pessoa="\nNome: "+ pf.gerarNome()   +"\nCPF: " +pf.generateCPF()+ "\nEndereco : " +pf.gerarEndereco()
		+"\nTelefone: "+ pf.gerarTelefone()+"\n\n";
		pessoaf.add(pessoa);
		JOptionPane.showMessageDialog(null, pessoa,"Pessoa Fisica", 1);
		
	}
	
	public void CriarPJ() {
		pessoa= "\nNome: "+ pj.gerarNome() + "\nNome da Empresa: " + pj.nomeEmpresa()+ "\nRamo da Empresa: "+ pj.ramoAtividade()+"\nEndereco : " +pj.gerarEndereco()
		+"\nTelefone: "+ pj.gerarTelefone()+ "\nE-mail: "+ pj.emailEmpresa()+ "\n";
		pessoaj.add(pessoa);
		JOptionPane.showMessageDialog(null, pessoa,"Pessoa Juridica",1);
	}
}
