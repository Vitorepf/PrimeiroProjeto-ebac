import javax.swing.JOptionPane;

public class Maiormenor {
	
	public void Maior(int nota1, int  nota2, int nota3, int nota4) {
		
		if (nota1 < nota2) {

			nota1 = nota2;

		} else if (nota1 < nota3) {
			nota1 = nota3;
		} else if (nota1 < nota4) {
			nota1 = nota4;
		}

		JOptionPane.showMessageDialog(null, "A maior nota e " + nota1);
	}
	
public void Menor(int nota1, int  nota2, int nota3, int nota4) {
		
		if (nota1 > nota2) {

			nota1 = nota2;

		} else if (nota1 > nota3) {
			nota1 = nota3;
		} else if (nota1 > nota4) {
			nota1 = nota4;
		}

		JOptionPane.showMessageDialog(null, "A menor nota e " + nota1);
	}
}
