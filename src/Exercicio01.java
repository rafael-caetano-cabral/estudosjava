class Exercicio01{
	// Na empresa em que trabalhamos, há tabelas com o gasto de cada mês. Para fechar o balanço do
	// primeiro trimestre, precisamos somar o gasto total. Sabendo que, em janeiro, foram gastos 15 mil
	// reais, em fevereiro, 23 mil reais e, em março, 17 mil reais, faça um programa que calcule e imprima
	// a despesa total no trimestre e a média mensal de gastos.
	// 
	
	public static void main(String[] args){
		
		
		
		double jan = 15.000;
		double fev = 23.000;
		double mar = 17.000;
		
		double totalGasto = jan + fev + mar;
		double mediaMensal = totalGasto / 3;
		
		System.out.println("Despesa Total no trimestre R$ " + totalGasto);
		
		System.out.println("Média mensal de gastos: R$ " + (int)mediaMensal);
		
		int a = 10;
		
		double b = a;
		
		// o (int) é um exemplo de casting
		
		System.out.println((int) b);
				
		
		/* float x = 0.0;
			
			O código acima não compila, pois todos os literais com ponto flutuante são considerados
			double pelo Java. E float não pode receber um double sem a perda de informação. Para
			fazê-lo funcionar, podemos escrever:
		float x = 0.0f; */
		
		// como também o f ao final do numero exibido para indicar que é float como no exemplo abaixo. Não muito comum de acontecer:	
		
		
		double d = 5;
		float f = 3;
		
		float x = f + (float) d;
		
		System.out.println((int)x);
		
	}
	
}