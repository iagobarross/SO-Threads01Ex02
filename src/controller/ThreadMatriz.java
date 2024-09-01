/*2) Fazer uma aplicação que insira números aleatórios em uma matriz 3 x 5 e tenha 3
chamadas de Threads, onde cada uma calcula a soma dos valores de cada linha,
imprimindo a identificação da linha e o resultado da soma.
Dica: A main deve gerar uma matriz com números aleatórios, mas a Thread recebe um vetor
(uma linha da matriz)
*/
package controller;

public class ThreadMatriz extends Thread{
	
	private int [] vet;
	private int linha;

	public ThreadMatriz(int[] vet, int linha) {
		this.vet = vet;
		this.linha = linha;
	}

	@Override
	public void run() {
		int soma = 0;
		for(int i: vet) {
			soma += i;
		}
		
		System.out.println("Soma da linha " + linha + ": " + soma);
	}
}
