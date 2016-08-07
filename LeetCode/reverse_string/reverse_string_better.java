public class reverse_string_better {


public static void main(String[] args) {

	System.out.println(reverse_string("hello"));


}

public static String reverse_string(String a) {

	StringBuilder sb = new StringBuilder();

	for(int i = a.length(); i>=1; i--) {
		sb.append(a.charAt(i-1));
	}

	return sb.toString();
}

}
