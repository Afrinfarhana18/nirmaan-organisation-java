package Multithreading;

class Threadclass1 extends Thread {
	public void run() {
		 for(int i=0; i<10;i++) {
			 System.out.println("Thread class 1");
		 }
	}

}

class Threadclass2 extends Thread {
	public void run() {
		for(int i=0; i<10;i++) {
			System.out.println("Thread class 2");
			
		}
	}
}
public class Mainclass {
	 public static void main(String[] args) {
		 Threadclass1 tc1 = new Threadclass1();
		 Threadclass2 tc2 = new Threadclass2();
		 tc1.start();
		 tc2.start();
	 }
}
