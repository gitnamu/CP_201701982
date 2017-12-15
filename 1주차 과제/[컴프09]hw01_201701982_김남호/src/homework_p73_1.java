import java.util.Scanner;

public class homework_p73_1 {
	public static void main(String args[]) {
		
		int mile;
		double km;
		
		Scanner input = new Scanner(System.in);		
		System.out.print("마일을 입력하십시오: ");
		mile = input.nextInt();
		km = mile*1.609;
		
		System.out.println(mile + "마일은" + km +"킬로미터입니다.");
	}
}