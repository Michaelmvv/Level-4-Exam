import java.util.Arrays;

public class test {
public static void main(String[] args) {
	String bob = "BCA";
	char[] test = bob.toCharArray();
	Arrays.sort(test);
	StringBuilder b = new StringBuilder();
	for (char c : test) {
		b.append(c);
	}
	System.out.println(b.toString());
}
}
