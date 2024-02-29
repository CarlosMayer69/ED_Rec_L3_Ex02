package view;

import controller.QuantasVezesRecController;

public class Principal {

	public static void main(String[] args) {
		
		QuantasVezesRecController qv = new QuantasVezesRecController();
		
		//int numero1 = 523578;
		//int numero2 = 5;
		  int numero1 = 836363;
		  int numero2 = 3;
		  
		//Verifica se o primeiro n�mero est� entre 10 e 999999
		if(numero1 > 9 && numero1 < 999999) {
			//Verifica se o segundo n�mero est� entre 0 e 9
			if(numero2 >= 0 && numero2 <= 9) {
				
				int resultado = qv.quantasVezes(numero1, numero2);
				
				System.out.println("O n�mero " + numero2 + " aparece " + resultado + " vezes no n�mero " + numero1 + ".");
			}
		}

	}

}
