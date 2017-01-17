package threads;

public class RunnableTest {

	public static void main(String[] args) {
		
		RunnableExample re = new RunnableExample();
		Thread t = new Thread(re);
		t.start();

	}

}
