package classe.DesafioModulo;

public class Pessoa {

	// atributos
	String nomePessoa;
	double pesoPessoa;

	Pessoa(String nomePessoa, double pesoPessoa) { // instanciei
		this.nomePessoa = nomePessoa;
		this.pesoPessoa = pesoPessoa;
	}

	// metodos
	void comer(Comida nomeComida) {
		if (nomeComida != null) {
			this.pesoPessoa += nomeComida.peso;
		}
	}

	String apresentar() {
		return "ola meu nome �:" + nomePessoa +
				" e tenho " + pesoPessoa + " Kg";
	}

}
