
public class Pessoa {
		
		private String nome;
		private int idade;
		private String genero;
		private String endereço;
		private String nacionalidade;
		private int cpf;
		private String estadoCivil;
		private int anoNascimento;
		private String bairro;
		private String estado;
		
		public Pessoa (String nome, int idade, String genero, String endereço, String nacionalidade, int cpf,
				       String estadoCivil, int anoNascimento, String bairro, String estado) {
			
			this.nome = nome;
			this.idade = idade;
			this.genero = genero;
			this.endereço = endereço;
			this.nacionalidade = nacionalidade;
			this.cpf = cpf;
			this.estadoCivil = estadoCivil;
			this.anoNascimento = anoNascimento;
			this.bairro = bairro;
			this.estado = estado;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		public String getEndereço() {
			return endereço;
		}

		public void setEndereço(String endereço) {
			this.endereço = endereço;
		}

		public String getNacionalidade() {
			return nacionalidade;
		}

		public void setNacionalidade(String nacionalidade) {
			this.nacionalidade = nacionalidade;
		}

		public int getCpf() {
			return cpf;
		}

		public void setCpf(int cpf) {
			this.cpf = cpf;
		}

		public String getEstadoCivil() {
			return estadoCivil;
		}

		public void setEstadoCivil(String estadoCivil) {
			this.estadoCivil = estadoCivil;
		}

		public int getAnoNascimento() {
			return anoNascimento;
		}

		public void setAnoNascimento(int anoNascimento) {
			this.anoNascimento = anoNascimento;
		}

		public String getBairro() {
			return bairro;
		}

		public void setBairro(String bairro) {
			this.bairro = bairro;
		}

		public String getEstado() {
			return estado;
		}

		public void setEstado(String estado) {
			this.estado = estado;
		}


}
