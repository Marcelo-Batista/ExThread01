package view;

import controller.Ex2Controller;

public class Ex1Principal {
	public static void main(String[] args) {
		
		int[][] matriz = new int[3][5];
		Ex2Controller t1 = new Ex2Controller(0,0);
		matriz = t1.preencherMatriz(matriz);
		
		for (int i=0; i<5; i++) {
			Thread exe1 = new Ex2Controller();
			exe1.start();
		}
	}
}
