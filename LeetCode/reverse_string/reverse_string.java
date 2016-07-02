 public class reverse_string {

	public static void main(String[] args) {

		String input = "hello";
		System.out.println(reverse(input));

	}


	public static String reverse(String s) {

		String reversed = "";
		for(int i = 0; i < s.length(); i++) {

			reversed = s.charAt(i) + reversed;

		}	

		return reversed;
	}
}
