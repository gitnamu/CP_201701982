import java.util.Scanner;

public class homework_p101_3 {
	public static void main(String args[]) {
		
		int cm;
		double ft;
		double in;
		Scanner input = new Scanner(System.in);
		System.out.print("Ű�� �Է��Ͻʽÿ�: ");
		cm = input.nextInt();
		ft = cm/12/2.54;
		in = cm/2.54 - (int)ft*12;
		
		System.out.println(cm+"cm�� "+(int)ft+"��Ʈ "+in+"��ġ�Դϴ�.");
	}
}