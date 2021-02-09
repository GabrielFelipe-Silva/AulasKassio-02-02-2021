
public class Carro {
	
	private String tipo;
	private int ano;
	private String modelo;
	private String combustivel;
	private int placa;
	private String cor;
	private int chassi;
	private int renavam;
	private int qtdPortas;
	private String motor;
	
	public Carro (String tipo, int ano, String modelo, String combustivel, int placa, String cor, 
			      int chassi, int renavam, int qtdPortas, String motor) {
		
		this.tipo = tipo;
		this.ano = ano;
		this.modelo = modelo;
		this.combustivel = combustivel;
		this.placa = placa;
		this.cor = cor;
		this.chassi = chassi;
		this.renavam = renavam;
		this.qtdPortas = qtdPortas;
		this.motor = motor;
	
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public int getPlaca() {
		return placa;
	}

	public void setPlaca(int placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getChassi() {
		return chassi;
	}

	public void setChassi(int chassi) {
		this.chassi = chassi;
	}

	public int getRenavam() {
		return renavam;
	}

	public void setRenavam(int renavam) {
		this.renavam = renavam;
	}

	public int getQtdPortas() {
		return qtdPortas;
	}

	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}
	
	

}
