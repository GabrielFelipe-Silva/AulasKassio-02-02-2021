
public class Animal {
	
	private int tamanho;
	private int idade;
	private int peso; 
	private String regiao;
	private String sexo; 
	private String cor;
	private String alimentaçao; 
	private String habitat; 
	private String pelagem;
	private String sono;
	
	public Animal (int tamanho, int idade, int peso, String regiao, String sexo, 
			String cor, String alimentaçao, String habitat, String pelagem, String sono) {
		
		this.tamanho = tamanho;
		this.idade = idade;
		this.peso = peso; 
		this.regiao = regiao;
		this.sexo = sexo; 
		this.cor = cor;
		this.alimentaçao = alimentaçao; 
		this.habitat = habitat; 
		this.pelagem = pelagem;
		this.sono = sono;
		
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAlimentaçao() {
		return alimentaçao;
	}

	public void setAlimentaçao(String alimentaçao) {
		this.alimentaçao = alimentaçao;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getPelagem() {
		return pelagem;
	}

	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}

	public String getSono() {
		return sono;
	}

	public void setSono(String sono) {
		this.sono = sono;
	}
	
	

}
