package controller;

import java.util.Random;

public class Ex1Controller extends Thread{
	
	@Override
	public void run(){
		imprime();
	}
	Random ale = new Random();
	private void imprime(){
		try {
			System.out.println(ale.nextInt());
		} catch (Exception e) {
				e.printStackTrace();
		}
	}
}
