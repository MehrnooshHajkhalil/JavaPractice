import java.util.Scanner;

public class MySweetProgram {

	public static void main(String[] args) {

		System.out.println("here in main");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		System.out.println(s);
		in.close();
	}
}
