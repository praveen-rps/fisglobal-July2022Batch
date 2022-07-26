package threqds;

import java.util.LinkedList;

class ProducerConsumer {

	// Create a list shared by producer and consumer
	// Size of list is 2.
	LinkedList<Integer> list = new LinkedList<>();
	int capacity = 2;

	// Function called by producer thread
	public void produce() throws InterruptedException
	{
		int value = 0;
		while (true) {
			{
				// producer thread waits while list
				// is full
				while (list.size() == capacity)
					

				System.out.println("Producer produced-"
								+ value);

				// to insert the jobs in the list
				list.add(value++);

				// notifies the consumer thread that
				// now it can start consuming
				

				// makes the working of program easier
				// to understand
				
			}
		}
	}

	// Function called by consumer thread
	public void consume() throws InterruptedException
	{
		while (true) {
			
			{
				// consumer thread waits while list
				// is empty
				while (list.size() == 0) {
					//wait();
				}
				// to retrieve the first job in the list
				int val = list.removeFirst();

				System.out.println("Consumer consumed-"
								+ val);

				// Wake up producer thread
				//notify();

				// and sleep
				//Thread.sleep(1000);
			}
		}
	}
}

public class ThreadWithoutSync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProducerConsumer pc = new ProducerConsumer();
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run()
			{
				try {
					pc.produce();
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		// Create consumer thread
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run()
			{
				try {
					pc.consume();
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		// Start both threads
		t2.start();
		t1.start();
		


	}

}
