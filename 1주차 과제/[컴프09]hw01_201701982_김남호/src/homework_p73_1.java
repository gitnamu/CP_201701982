import java.util.Scanner;

public class homework_p73_1 {
	public static void main(String args[]) {
		
		int mile;
		double km;
		
		Scanner input = new Scanner(System.in);		
		System.out.print("������ �Է��Ͻʽÿ�: ");
		mile = input.nextInt();
		km = mile*1.609;
		
		System.out.println(mile + "������" + km +"ų�ι����Դϴ�.");
	}
}