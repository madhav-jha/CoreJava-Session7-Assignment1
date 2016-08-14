package session7.assignment1;

public class ExceptionArrayIndex {

	public static void main(String[] args) {
		int arr[] = { 6, 9, 5, 0, 1 };

		try {
			System.out.println(arr[6]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("you cannot print element at index 6\n" + e);
		}

		System.out.println("Control flow continues...");
	}

}
