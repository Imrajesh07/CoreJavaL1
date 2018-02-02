import java.util.Scanner;
public class Binary {

	public static void main(String[] args) {
		int num, rem;
		String result = new String();
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		s.close();
		while (num / 2 != 0) {
			rem = num % 2;
			num = num / 2;
			result = rem + result;
		}
		result = num + result;
		System.out.println(result);
	}
}
