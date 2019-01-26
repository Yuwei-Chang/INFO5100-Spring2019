package class3;

public class StringManipulator {
	
	public boolean startsWith(String a, String b) {
		return a.startsWith(b);
	}

	public boolean startsWithOld(String a, String b) {
		// "Siva Dosapati", "Si" - > True
		// "Siva Dosapati" , "AB" -> False
		char[] source = a.toCharArray();
		char[] target = b.toCharArray();
		for (int i = 0; i < target.length; i++) {
			char s = source[i];
			char t = target[i];
			if (s != t) {
				return false;
			}
		}
		return true;
	}

	public boolean endsWith(String a, String b) {
		// "Siva Dosapati", "ti" - > True
		// "Siva Dosapati" , "AB" -> False

		char[] source = a.toCharArray();
		char[] target = b.toCharArray();
		int sourceLength = source.length;
		for (int i = 0; i < target.length; i++) {
			char s = source[sourceLength - target.length + i];
			char t = target[i];
			if (s != t) {
				return false;
			}
		}
		return true;

	}

	public boolean startsAndEndsWith(String a, String b, String c) {
		// "Siva Dosapati", "Si", "ti" -> True
		// "Siva Dosapati", "Si","xy" -> False
		boolean one = a.startsWith(b);
		if (one == false)
			return false;
		return a.endsWith(c);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
