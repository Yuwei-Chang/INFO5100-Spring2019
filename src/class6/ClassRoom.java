package class6;

public class ClassRoom {

	public static void main(String[] args) throws QuestionIncompleteException {
		Professor p = new Professor();
		for (int i = 1; i <= 100; i++) {
			answerSequentiallyAndSkipForIncompleteQuestions(p, i);
			// answerSequentiallyButGiveAnotherOpportunityForIncompleteQuestions(p, i);
			// String answer = p.answer("Question # " + i + " is modified");
			// System.out.println(answer);

		}

	}

	private static void answerSequentiallyButGiveAnotherOpportunityForIncompleteQuestions(Professor p, int i) {
		try {

			String answer = p.answer("Question # " + i);
			System.out.println(answer);
		} catch (QuestionIncompleteException qe) {
			try {
				String answer = p.answer("Question # " + i + " is modified");
				System.out.println(answer);
			} catch (QuestionIncompleteException xx) {
				System.out.println("Couldn't take the next opportunity -> " + qe.question
						+ " was the first attempt. -> " + xx.question + " was the second attempt");
			}
		}

	}

	private static void answerSequentiallyAndSkipForIncompleteQuestions(Professor p, int i) {
		try {

			String answer = p.answer("Question # " + i);
			System.out.println(answer);
		} catch (QuestionIncompleteException qe) {
			System.out.println("Incomplete question by Student # " + i + ". The Question[ " + qe.question
					+ "] is incomplete. Let's skip this question");
		}
	}

}

class ProfessorUnConsciousException extends RuntimeException {

}

class Professor {
	StudentGroup sg = new StudentGroup();

	String answer(String question) throws QuestionIncompleteException {

		int x = Util.getRandom(100);
		if (x > 95) {
			throw new ProfessorUnConsciousException();
		}

		String answer = null;
		try {
			answer = sg.tryAnswering(question);
			return answer;
		} catch (StudentGroupCantAnswerException sgcae) {
			return "Answered by Professor[" + question + "]";
		} catch (QuestionIncompleteException qe) {
			throw qe;
		} finally {
			System.out.println("Professor is thanking for asking question -> " + question);
		}
	}
}

class Student {

}

class StudentGroupCantAnswerException extends Exception {
}

class QuestionIncompleteException extends Exception {
	String question;

	QuestionIncompleteException(String question) {
		this.question = question;
	}

}

class StudentGroup {

	String tryAnswering(String question) throws StudentGroupCantAnswerException, QuestionIncompleteException {
		int randomNumber = Util.getRandom(10);
		if (randomNumber <= 3) {
			return "Answered by Student Group[" + question + "]";
		}
		if (randomNumber <= 6) {
			StudentGroupCantAnswerException e = new StudentGroupCantAnswerException();
			throw e;
		} else {
			throw new QuestionIncompleteException(question);
		}

	}
}

class Util {
	static int getRandom(int x) {
		return (int) (Math.random() * x);
	}
}
