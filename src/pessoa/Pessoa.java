 package pessoa;

public class Pessoa {
	
	private final String nome;
	private final Integer idade;
	private final String nacionalidade;
	private final String nomeMae;
	private String nomePai = "";
	
	private Pessoa(Builder builder) {
		this.nome = builder.nome;
		this.idade = builder.idade;
		this.nacionalidade = builder.nacionalidade;
		this.nomeMae = builder.nomeMae;
		this.nomePai = builder.nomePai;
	}
	
	public static class Builder {

		private String nome;
		private Integer idade;
		private String nacionalidade;
		private String nomeMae;
		private String nomePai = "";
		
		public Builder nome(final String nome) {
			this.nome = nome;
			return this;
		}
		
		public Builder idade(final Integer idade) {
			this.idade = idade;
			return this;
		}

		public Builder nacionalidade(final String nacionalidade) {
			this.nacionalidade = nacionalidade;
			return this;
		}
		
		public Builder nomeMae(final String nomeMae) {
			this.nomeMae = nomeMae;
			return this;
		}
		
		public Builder nomePai(String nomePai) {
			this.nomePai = nomePai;
			return this;
		}
		
		public Pessoa build() {
			return new Pessoa(this);
		}

	}

	public String getNomePai() {
		return nomePai;
	}

	public String getNome() {
		return nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public String getNomeMae() {
		return nomeMae;
	}
}
