import java.util.Scanner;

class Exercicio04 {

	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o número Fatorial: ");
		
		int numfat = entrada.nextInt();
		
		int fat = 1;
		
		int cont = 1;
		
		if(numfat == 0){
			
			System.out.println(numfat + "! = 1");
		
		}else{
		
	    
		for(int i = 1; i < numfat; i++){
			
			cont = cont * i;
		}
		
		fat = numfat * cont;	
		
		System.out.println(numfat + "! = " + fat);

		}

		entrada.close();
	}
}


