
public class Produto {
	
	private int codProduto;
	private int qtdProduto;
	private double valorProduto;
	private String cor;
	private double desconto;
	private String material;
	private String formato;
	private String estado;
	private int validade;
	private double custoValidacao;
	
	public Produto (int codProduto, int qtdProduto, double valorProduto, String cor, double desconto,
			String material, String formato, String estado, int validade, double custoValidacao) {
		
		this.codProduto = codProduto;
		this.qtdProduto = qtdProduto;
		this.valorProduto = valorProduto;
		this.cor = cor;
		this.desconto = desconto;
		this.material = material;
		this.formato = formato;
		this.estado = estado;
		this.validade = validade;
		this.custoValidacao = custoValidacao;
	}

	public int getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}

	public int getQtdProduto() {
		return qtdProduto;
	}

	public void setQtdProduto(int qtdProduto) {
		this.qtdProduto = qtdProduto;
	}

	public double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getValidade() {
		return validade;
	}

	public void setValidade(int validade) {
		this.validade = validade;
	}

	public double getCustoValidacao() {
		return custoValidacao;
	}

	public void setCustoValidacao(double custoValidacao) {
		this.custoValidacao = custoValidacao;
	}
	
	

}
