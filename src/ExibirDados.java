public class ExibirDados{
	
	private int idade = 39;
	
	
	public Integer entregaValor(){
		int idadeRetornada = this.idade;
		return idadeRetornada;
	}
    public Integer mostrarIdadeRetornada(){
		int valor = entregaValor();
		return valor;
	}
	
	public static void main(String[] args){
	     
		 /* Porque teve necessidade de criar a instância do objeto, porque o metodo main é "static" ou seja, considera que
		 a instância é do próprio objeto. Nesse caso como é da classe, logo dá erro caso não seja instânciando localmente no 
		 metodo. */
		 
		 /* ExibirDados exibir = new ExibirDados();
		 
		 System.out.println("Testando saída de dados! " + exibir.entregaValor()); */
		 
	String [] nome = {"Rafael", "Caetano", "Cabral"};
		 System.out.println("Mostrando o nome da Pessoa: " + nome[0]);
		 System.out.println("Mostrando o nome da Pessoa: " + nome[1]);
	}
}