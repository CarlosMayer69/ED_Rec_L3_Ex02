/* 
 * 2. 
 * Criar uma aplica��o em Java que tenha uma fun��o recursiva que, 
 * recebendo um n�mero inteiro de 10 a 999999 e 
 * recebendo um 2� n�mero inteiro (de 0 a 9), 
 * tenha uma fun��o recursiva que apresente quantas vezes o 
 * 2� n�mero aparece no primeiro.
 * 
 * Exemplo 1: 
 * 1� N�mero = 523578; 2� N�mero = 5; retorno aparece 2 vezes.
 * 
 * Exemplo 2: 
 * 1� N�mero = 836363; 2� N�mero = 3; retorno aparece 3 vezes.
 * 
 * A valida��o da entrada e do d�gito deve ser feito na 'main' da aplica��o e 
 * n�o na fun��o recursiva;
 * 
 * O C�digo deve apresentar, em formato de coment�rio, 
 * como foi definida a condi��o de parada;
 * 
 * O C�digo deve apresentar, em formato de coment�rio, 
 * como foi definida a rela��o de chamada dos passos.
 * 
*/

package controller;

public class QuantasVezesRecController {

	public QuantasVezesRecController() {
		
		    super();
		    
	}
	
	//Fun��o recursiva que conta quantas vezes o n�mero2 aparece no n�mero1
	
			public static int quantasVezes(int numero1, int numero2) {
				
				//Condi��o de parada
				if(numero1 == 0) {
					return 0;
				}
				
				//Rela��o de chamada dos passos
				int digitoAtual = numero1 % 10;
				
				if(digitoAtual == numero2) {
					return 1 + quantasVezes(numero1/10, numero2);
				} else {
					return 0 + quantasVezes(numero1/10, numero2);
				}
			}
			
}
