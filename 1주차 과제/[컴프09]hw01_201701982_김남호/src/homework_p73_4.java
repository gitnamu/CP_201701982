import java.util.Scanner;

public class homework_p73_4 {
	public static void main(String args[]) {
		
		double f;
		double c;
		Scanner input = new Scanner(System.in);
		System.out.print("ȭ�� �µ��� �Է��Ͻʽÿ�: ");
		f = input.nextDouble();
		c = 5*(f-32)/9;
		
		System.out.println("�����µ��� " + c + "�Դϴ�");
	}
}
