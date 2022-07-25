package threqds;

class MyExample{
	public void display() {
		for(int i=1;i<=50;i++)
			System.out.println(i);
	}
}



public class ThreadExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Runnable r = ()->{
			System.out.println("Thread numbers count begin");
			for(int i=1;i<=50;i++)
				System.out.println(i);
			System.out.println("Threads numeber count end");
		};
		Thread t = new Thread(r);
		
		//MyExample m = new MyExample();
		//m.display();
		t.start();
		System.out.println("Main numbers count begin");
		for(int i=100;i<=150;i++)
			System.out.println(i);
		
		System.out.println("Main numbers count end");

	}

}
