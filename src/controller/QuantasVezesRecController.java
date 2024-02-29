/* 
 * 2. 
 * Criar uma aplicação em Java que tenha uma função recursiva que, 
 * recebendo um número inteiro de 10 a 999999 e 
 * recebendo um 2º número inteiro (de 0 a 9), 
 * tenha uma função recursiva que apresente quantas vezes o 
 * 2º número aparece no primeiro.
 * 
 * Exemplo 1: 
 * 1º Número = 523578; 2º Número = 5; retorno aparece 2 vezes.
 * 
 * Exemplo 2: 
 * 1º Número = 836363; 2º Número = 3; retorno aparece 3 vezes.
 * 
 * A validação da entrada e do dígito deve ser feito na 'main' da aplicação e 
 * não na função recursiva;
 * 
 * O Código deve apresentar, em formato de comentário, 
 * como foi definida a condição de parada;
 * 
 * O Código deve apresentar, em formato de comentário, 
 * como foi definida a relação de chamada dos passos.
 * 
*/

package controller;

public class QuantasVezesRecController {

	public QuantasVezesRecController() {
		
		    super();
		    
	}
	
	//Função recursiva que conta quantas vezes o número2 aparece no número1
	
			public static int quantasVezes(int numero1, int numero2) {
				
				//Condição de parada
				if(numero1 == 0) {
					return 0;
				}
				
				//Relação de chamada dos passos
				int digitoAtual = numero1 % 10;
				
				if(digitoAtual == numero2) {
					return 1 + quantasVezes(numero1/10, numero2);
				} else {
					return 0 + quantasVezes(numero1/10, numero2);
				}
			}
			
}
