
/**
 * @author Vitorepf
 *
 */
public class Caneta {
	private String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;
	
	// Construtor Caneta
	public Caneta(String modelo, float ponta, String cor) {
		this.setModelo(modelo);
		this.setPonta(ponta);
		this.setCor(cor);
		this.tampar();
		
	}
	
	// Setters
	
	public void setModelo(String modelo) {
		this.modelo=modelo;
	}
	
	public void setPonta(float ponta) {
		this.ponta=ponta;
	}
	
	public void setCor(String cor) {
		this.cor=cor;
	}
	
	// Getters
	
	public String getModelo() {
		return this.modelo;
	}
	
	public float getPonta() {
		return this.ponta;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	// metodo para tampar a caneta 
	public void tampar() {
		this.tampada=true;
	}
	
	// metodo para destampar a caneta 
	public void destampar() {
		this.tampada=false;
	}
	
	// Método para dar o status da caneta 
	public void status() {
		System.out.println("Sobre a caneta\n------------------------ ");
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Cor: "+ this.cor);
		System.out.println("tampada: "+ this.tampada);
	}
}
