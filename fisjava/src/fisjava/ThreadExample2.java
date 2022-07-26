package threqds;

class MyThread extends Thread{
	public void run(){
		for(int i=0;i<=50;i++) {
			try {
				this.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}


public class ThreadExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//MyThread t = new MyThread();
		//t.start();
		
		Runnable r = ()->{
			for(int i=1000;i<=1020;i++) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i);
			}
		};
		
		Thread t1 = new Thread(r);
		t1.start();
		
		/*
		System.out.println("Id:" +t.getId());
		System.out.println("Name: "+t.getName());
		t.setName("MyfisThread");
		System.out.println("Name: "+t.getName());
		System.out.println("Priority : "+t.getPriority());
		System.out.println("State : "+t.getState());
		System.out.println("Is Deamon : "+t.isDaemon());
		System.out.println("Is Alive : "+t.isAlive());
		System.out.println("Is interrupted "+t.isInterrupted());
		
		*/

	}

}
