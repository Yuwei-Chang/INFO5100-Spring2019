package class7;

public class Student extends Person {

	private static Object STUDENT_QUESTION_LOCK = new Object();

	Student(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void askQuestion() {
		synchronized (STUDENT_QUESTION_LOCK) {
			perform("Questioning");
		}
	}

	public static void main(String args[]) throws Exception {
		Student edison = new Student("Edison");
		Student terry = new Student("Terry");
		// sequential(edison, terry);
		parallel(edison, terry);
	}

	private static void parallel(Student edison, Student terry) throws Exception {
		//Runtime.getRuntime().gc();
		//Runtime.getRuntime().freeMemory();
		Thread a = makeAskThread(edison);
		Thread b = makeAskThread(terry);
		a.start();
		b.start();
		a.join();
		b.join();
		a.yield();
		// makeThinkThread(edison).start();
		// makeThinkThread(terry).start();
		System.out.println("Done");

	}

	private static void sequential(Student edison, Student terry) {
		edison.askQuestion();
		edison.think();
		terry.askQuestion();
		terry.think();
	}

	private static Thread makeAskThread(Student s) {
		return new Thread(() -> s.askQuestion());
	}

	private static Thread makeThinkThread(Student s) {
		return new Thread(() -> s.think());
	}

}
