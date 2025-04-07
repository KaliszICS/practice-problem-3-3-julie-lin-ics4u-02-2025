import java.util.ArrayList;

public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static ArrayList<String> perms(String str) {
		ArrayList<String> permutations = new ArrayList<String>();

		permuteHelper("", str, permutations);
		return permutations;
	}
	public static void permuteHelper(String usedLetters, String unusedLetters, ArrayList<String> permutations) {
		if (unusedLetters.length() == 0){
			permutations.add(usedLetters);
		}
		else {
			for (int i = 0; i < unusedLetters.length(); i++) {
				char current = unusedLetters.charAt(i);
				String remaining = unusedLetters.substring(0, i) + unusedLetters.substring(i+1);
				permuteHelper(usedLetters + current, remaining, permutations);
			}
		}

	}

	public static ArrayList<String> permsUnique(String str) {
		ArrayList<String> permutations = new ArrayList<String>();
		permUniqueHelper("", str, permutations);
		return permutations;
	}

	public static void permUniqueHelper(String usedLetters, String unusedLetters, ArrayList<String> permutations) {
		if (unusedLetters.length() == 0){
			if (!permutations.contains(usedLetters)) {
				permutations.add(usedLetters);
			}
		}
		else {
			for (int i = 0; i < unusedLetters.length(); i++) {
				char current = unusedLetters.charAt(i);
				String remaining = unusedLetters.substring(0, i) + unusedLetters.substring(i+1);
				permUniqueHelper(usedLetters + current, remaining, permutations);
			}
		}
	}

}
