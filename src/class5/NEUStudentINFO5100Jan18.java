package class5;

class NEUTAInfo5100Jan18 {
	String name;

	NEUTAInfo5100Jan18(String name) {
		this.name = name;
	}

	public void giveAssignment() {
		System.out.println(name + " is giving assignment");
	}
}

public class NEUStudentINFO5100Jan18 {
	String name;
	static NEUProfessorINFO5100Jan18 professor = new NEUProfessorINFO5100Jan18("Siva");
	static NEUTAInfo5100Jan18 ta = new NEUTAInfo5100Jan18("Fiona");

	public NEUStudentINFO5100Jan18(String name) {
		this.name = name;
	}

	public void askForAssignment() {
		ta.giveAssignment();
	}

	public void changeTAName(String name) {
		ta.name = name;
	}

	public void askQuestion(String question) {
		System.out.println(name + " is asking question to professor -> " + professor.name);
		professor.answer(question);
	}

	public void askProfessorToChangeName(String name) {
		professor.name = name;
	}

	public static void main(String args[]) {
		NEUStudentINFO5100Jan18 jason = new NEUStudentINFO5100Jan18("Jason");
		NEUStudentINFO5100Jan18 phoenix = new NEUStudentINFO5100Jan18("Phoenix");
		jason.askQuestion("How is Weather");
		jason.askProfessorToChangeName("Cva");
		jason.askQuestion("Will it be snowing next week");
		phoenix.askQuestion("Do we have class next week");

		System.out.println("--------------");

		jason.askForAssignment();
		phoenix.askForAssignment();
		jason.changeTAName("Amanda");
		jason.askForAssignment();
		phoenix.askForAssignment();

	}

}

class NEUProfessorINFO5100Jan18 {
	String name;

	public NEUProfessorINFO5100Jan18(String name) {
		this.name = name;
	}

	public void answer(String question) {
		System.out.println(name + " is answering question -> " + question);
	}
}