package class7;

public class Person {
	String name;

	Person(String name) {
		this.name = name;
	}

	void think() {
		perform("thinking");
	}

	synchronized void eat() {
		perform("Eating");
	}

	void perform(String action) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {
			System.out.println(name + " is " + action + " # " + i);
			pause(100);
			/*
			 * int number = random(10); if (number > 8) { throw new RuntimeException(name +
			 * " while performing " + action + " had a problem"); }
			 */

		}
		long end = System.currentTimeMillis();
		System.out.println(name + " was " + action + " for -> " + (end - start) + " millis ");

	}

	synchronized void talk() {
		perform("talking");
	}

	void listen() {
		perform("listening");
	}

	int random(int x) {
		return (int) (Math.random() * x);
	}

	void pause(int x) {
		try {
			Thread.sleep(x);
		} catch (Exception e) {
		}
	}

	public static void main(String args[]) throws Exception {
		// doSomeOperation();
		doAnotherOperation();
	}

	private static void doAnotherOperation() {
		Person jennifer = new Person("Jennifer");
		Person phoenix = new Person("Phoenix");
		Thread eat = new Thread(() -> jennifer.eat());
		Thread talk = new Thread(() -> jennifer.talk());
		Thread listen = new Thread(() -> jennifer.listen());
		eat.start();
		talk.start();
		Thread pEat = new Thread(() -> phoenix.eat());
		Thread pTalk = new Thread(() -> phoenix.talk());
		pTalk.start();
		pEat.start();
		

		// listen.start();

	}

	private static void doSomeOperation() {

		final Person amanda = new Person("Amanda");
		// amanda.talk();
		// amanda.think();

		Thread talker = new Thread() {
			public void run() {
				amanda.talk();
			}
		};

		Thread thinker = new ThinkerThread(amanda);

		Listener l = new Listener(amanda);
		Thread listenerThread = new Thread(l);

		listenerThread.start();
		talker.start();
		thinker.start();

		Person charlie = new Person("Charlie");
		Thread charlieThinkThread = new ThinkerThread(charlie);
		Thread charlieListenThread = new Thread(new Listener(charlie));
		charlieThinkThread.start();
		charlieListenThread.start();
		// throw new Exception("Main is dead");
		// Thread.sleep(1000);
		// System.out.println("Amanda is Talking and Thinking at the same time");
	}

	static class ThinkerThread extends Thread {
		Person p;

		ThinkerThread(Person p) {
			this.p = p;
		}

		public void run() {
			p.think();
		}
	}

	static class Listener implements Runnable {
		Person p;

		Listener(Person p) {
			this.p = p;
		}

		@Override
		public void run() {
			p.listen();
		}

	}

}
