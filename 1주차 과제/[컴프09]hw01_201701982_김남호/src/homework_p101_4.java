import java.util.Scanner;
public class homework_p101_4 {
	public static void main(String args[]) {
		int r;
		int h;
		double v;
		final double p = 3.141592;
		Scanner input = new Scanner(System.in);
		System.out.print("����� �ظ��� �������� �Է��Ͻÿ�: ");
		r = input.nextInt();
		System.out.print("������� ���̸� �Է��Ͻÿ�: ");
		h = input.nextInt();
		
		v = r*r*p*h;
		System.out.println("������� ���Ǵ� "+v+"�Դϴ�.");
	}
}
