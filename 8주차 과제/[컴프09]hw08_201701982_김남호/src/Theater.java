import java.util.Scanner;
public class Theater {
	public static void main(String[] args) {
		int seat[] = new int[10];
		Scanner input = new Scanner(System.in);
		do {
		System.out.print("�¼��� �����Ͻðڽ��ϱ�? (1 �Ǵ� 0) ");
		int reservation = input.nextInt();
		if(reservation == 1) {
			System.out.println("---------------------------------");
			System.out.println("  1  2  3  4  5  6  7  8  9  10");
			System.out.println("---------------------------------");
			for(int i = 0;i<seat.length;i++)
				System.out.print(seat[i]+"  ");
				System.out.println("");
			System.out.print("���° �¼��� �����Ͻðڽ��ϱ�? ");
			int num = input.nextInt();
			if(seat[num - 1] == 0) {
				System.out.println("����Ǿ����ϴ�.");
				seat[num - 1] = 1;
				}
			else
				System.out.println("�̹� ����� �¼��Դϴ�.");
		}
		else if(reservation == 0) {
			System.out.println("��ҵǾ����ϴ�.");
			break;
			
		}
		else
			System.out.println("1 �Ǵ� 0�� �Է����ֽʽÿ�.");
	
		} while(true);

	}
}