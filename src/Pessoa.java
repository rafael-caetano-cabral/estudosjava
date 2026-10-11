public class Pessoa{
	
	private String nome = "Rafael";
	
	private int idade = 39; 
	
		public String getNome(){
			return nome;
		}		
		public void setNome(String nome){
			if(nome != null && !nome.isBlank()){
				this.nome = nome;
			}
		}
		public Integer getIdade(){
			return idade;
		}
		public void setIdade(int idade){
			this.idade = idade;
		}
}