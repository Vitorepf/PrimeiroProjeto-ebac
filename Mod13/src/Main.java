import javax.swing.JOptionPane;

public class Main {
	
	public static void main (String[] args) {
		int choice;
		int op=1;
		GerarP gera = new GerarP();
		String[] opcao= {"Gerar PF", "Gerar PJ"};
		
		do {
		int tipo=JOptionPane.showOptionDialog(null,"Escolha uma opcao: ","Selecione a opcao",0,1,null, opcao,opcao[0]);
		
		if (tipo == 0) {
			gera.CriarPF();
		}

		if (tipo == 1) {
			gera.CriarPJ();
		}
		
		 choice= JOptionPane.showConfirmDialog(null,"Deseja criaar mais uma pessoa fisica ou juridica?","confirma",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
			
		}while(choice==JOptionPane.YES_OPTION);
		
		JOptionPane.showMessageDialog(null, gera.pessoaf, "Pessoas Fisicas",1);
		JOptionPane.showMessageDialog(null, gera.pessoaj, "Pessoas Juridicas",1);
		
	
	}
}
