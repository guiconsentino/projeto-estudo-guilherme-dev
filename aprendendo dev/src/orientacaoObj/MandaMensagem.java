package orientacaoObj;

public class MandaMensagem {
	
	int idade;
	
	void mandaBoasVindas(String nome, int idade) {
		this.idade = idade;
		
		System.out.println("bom dia " + nome + " voce vai conseguit!");
		
		System.out.println("sua idade é " + idade + "?" );
	}
	
	void mandaMensagem() {
		if(idade >= 25) {
			System.out.println("voce é fera	");
			
		}
	}
}
