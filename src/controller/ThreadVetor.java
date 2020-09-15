package controller;

import java.util.Random;

public class ThreadVetor extends Thread {

	private int num;
	private int[] vetor = new int[1000];
	long tInicio;
	long tFim;

	public ThreadVetor(int num, int[] vetor) {
		this.num = num;
		this.vetor = vetor;
	}

	@Override
	public void run() {
		contaTempo();
	}

	private void contaTempo() {

		if (num % 2 != 0) {
			Random random = new Random();
			tInicio = System.currentTimeMillis();
			for (int i = 0; i < vetor.length; i++) {
				vetor[i] = random.nextInt(100);
			}
			tFim = System.currentTimeMillis();
			long tFinal = (tFim - tInicio);
			System.out.println("O tempo de execução foi após percorrer o 'for' foi " + tFinal + " milisegundos.");
		} else {
			Random random = new Random();
			tInicio = System.currentTimeMillis();
			for (int i : vetor) {
				vetor[i] = random.nextInt(100);
				i++;
			}
			tFim = System.currentTimeMillis();
			long tFinal = (tFim - tInicio);
			System.out.println("O tempo de execução após percorrer o 'foreach' foi " + tFinal + " milisegundos.");
		}

	}

}
