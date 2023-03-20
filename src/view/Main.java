package view;

import java.util.Random;
import java.util.concurrent.Semaphore;
import controller.CorredorController;

public class Main {
	
	public static Semaphore semaforo;

	public static void main(String[] args) {
		
		int maxCorredores = 1;
		int totalCorredores = 4;
		
		semaforo = new Semaphore(maxCorredores);
		
		for(int i = 0; i <= 4; i++) {
			Thread corredor = new CorredorController(i, semaforo);
			corredor.start();
		}

	}

}
