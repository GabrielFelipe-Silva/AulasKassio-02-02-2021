
public class Conta {
	
	private int numeroConta;
	private String titular;
	private int saldo;
	private int limite;
	private int numeroAgencia;
	private String nomeAgencia;
	private int dataAbertura;
	private int cpf;
	private String tipo;
	private String historicoTransferencia;
	
	public Conta (int numeroConta, String titular, int saldo, int limite, int numeroAgencia, String nomeAgencia,
			      int dataAbertura, int cpf, String tipo, String historicoTransferencia) {
		
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
		this.limite = limite;
		this.numeroAgencia = numeroAgencia;
		this.nomeAgencia = nomeAgencia;
		this.dataAbertura = dataAbertura;
        this.cpf = cpf;
		this.tipo = tipo;
		this.historicoTransferencia = historicoTransferencia;
		
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}

	public int getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public String getNomeAgencia() {
		return nomeAgencia;
	}

	public void setNomeAgencia(String nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}

	public int getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(int dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getHistoricoTransferencia() {
		return historicoTransferencia;
	}

	public void setHistoricoTransferencia(String historicoTransferencia) {
		this.historicoTransferencia = historicoTransferencia;
	}

}
