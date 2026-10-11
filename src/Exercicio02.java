class Exercicio02{

// Estrutura de Loops while e do while


	public static void main(String[] args){
		
		int numero = 0;
		
			
			// While
			while(numero <= 10){
			 
			 System.out.println("O número atual é: " + numero);
					
			 numero+=1;
			
			}
				
			// Do while
			
			int contador = 10;
			
			do{
				contador++;
				System.out.println("O valor do contador é: " + contador);
			}while(contador <= 10);
	}
}