import java.util.Scanner;
public class practice2 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int ����;
		int ��;
		int ����;
		int ��;
		int ��;
		
		System.out.print("500�� ���� : ");
		���� = input.nextInt();
		
		System.out.print("100�� ���� : ");
		�� = input.nextInt();
	 
		System.out.print("50�� ���� : ");
		���� = input.nextInt();
		
		System.out.print("10�� ���� : ");
		�� = input.nextInt();
		
		�� = 500*����+100*��+50*����+10*��;
		
		System.out.println("���� �׼� : "+��);
	}
}
