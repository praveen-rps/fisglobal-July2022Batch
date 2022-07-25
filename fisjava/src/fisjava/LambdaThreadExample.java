package fisjava;

class MyThread implements Runnable{
	public void run() {
		System.out.println("Inside the run method....");
	}
}
public class LambdaThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t = new MyThread();
		
		Runnable r = ()->System.out.println("Inside the run method for lamdba....");
		Thread t1 = new Thread(r);
		t1.start();

	}

}
