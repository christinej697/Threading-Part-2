package hw3;

import java.util.Random;
import java.util.Arrays;

class Thread1 implements Runnable{
	
	int[] array;
	int index;
	
	public Thread1(int[] array, int index) {
		this.array = array;
		this.index = index;
	}
	
	public void run() {
		Random rand = new Random();
		int num;
		
			try
			{
				Thread.sleep(100);
				num = rand.nextInt(100);
				array[index] = num;
				System.out.println("Thread <t1> inserted <" + num +">");
			}
			catch(InterruptedException ex) {
				System.out.println("The thread was interrupted");
			}
	}
}

class Thread2 implements Runnable{
	
	int[] array;
	int index;
	
	public Thread2(int[] array, int index) {
		this.array = array;
		this.index = index;
	}
	
	public void run() {
		Random rand = new Random();
		int num;

			try
			{
				Thread.sleep(100);
				num = rand.nextInt(100);
				array[index] = num;
				System.out.println("Thread <t2> inserted <" + num +">");
			}
			catch(InterruptedException ex) {
				System.out.println("The thread was interrupted");
			}
	}
}

class Thread3 implements Runnable{
	
	int[] array;
	int index;
	
	public Thread3(int[] array, int index) {
		this.array = array;
		this.index = index;
	}
	
	public void run() {
		Random rand = new Random();
		int num;

			try
			{
				Thread.sleep(100);
				num = rand.nextInt(100);
				array[index] = num;
				System.out.println("Thread <t3> inserted <" + num +">");
			}
			catch(InterruptedException ex) {
				System.out.println("The thread was interrupted");
			}
	}
}

class Thread4 implements Runnable{
	
	int[] array;
	int index;
	
	public Thread4(int[] array, int index) {
		this.array = array;
		this.index = index;
	}
	
	public void run() {
		Random rand = new Random();
		int num;

			try
			{
				Thread.sleep(100);
				num = rand.nextInt(100);
				array[index] = num;
				System.out.println("Thread <t4> inserted <" + num +">");
			}
			catch(InterruptedException ex) {
				System.out.println("The thread was interrupted");
			}
	}
}

public class Threading_Part2 {
	
	static int[] array = new int[4];
	
	public static void main (String[] args) {
		
		Thread t = new Thread(new Thread1(array, 0));
		Thread t2 = new Thread(new Thread2(array, 1));
		Thread t3 = new Thread(new Thread3(array, 2));
		Thread t4 = new Thread(new Thread4(array, 3));
		t.start();
		try {
			t.join(1000);
		}catch(InterruptedException ex) {
			//do nothing
		}
		t2.start();
		try {
			t2.join(1000);
		}catch(InterruptedException ex) {
			//do nothing
		}
		t3.start();
		try {
			t3.join(1000);
		}catch(InterruptedException ex) {
			//do nothing
		}
		t4.start();
		try {
			t4.join(1000);
		}catch(InterruptedException ex) {
			//do nothing
		}
		System.out.println("Final Array: " + Arrays.toString(array));
	}

}
