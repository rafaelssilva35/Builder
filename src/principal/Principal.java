package principal;

import pessoa.Pessoa;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa.Builder()
								  .nome("Rafael silva")
								  .nomeMae("Mãe")
								  .idade(28)
								  .nacionalidade("Teste")
								  .build();
								  
		System.out.println(pessoa.getNome());		
		System.out.println(pessoa.getIdade());
	}

}
