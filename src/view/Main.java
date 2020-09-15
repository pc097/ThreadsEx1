package view;

import controller.ThreadVetor;

public class Main {

	public static void main(String[] args) {
		int[] vetor = new int[1000];
		int num1 = 1;
		Thread threadVetor1 = new ThreadVetor(num1, vetor);
		threadVetor1.start();

		int num2 = 2;
		Thread threadVetor2 = new ThreadVetor(num2, vetor);
		threadVetor2.start();
	}

}
