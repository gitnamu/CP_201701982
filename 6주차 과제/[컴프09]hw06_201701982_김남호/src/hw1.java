import java.util.Scanner;

public class hw1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str;
		
		System.out.print("문자열을 입력하시오: ");
		str = input.nextLine();
		
		System.out.println(reverse(str));
	}
	
	public static String reverse(String s) {
		String t = "";
		for(int i=s.length()-1;i>=0;i--) {
			t=t+s.charAt(i);
		}
		return t;
	}
}
