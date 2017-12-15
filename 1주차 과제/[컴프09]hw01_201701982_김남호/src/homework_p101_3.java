import java.util.Scanner;

public class homework_p101_3 {
	public static void main(String args[]) {
		
		int cm;
		double ft;
		double in;
		Scanner input = new Scanner(System.in);
		System.out.print("키를 입력하십시오: ");
		cm = input.nextInt();
		ft = cm/12/2.54;
		in = cm/2.54 - (int)ft*12;
		
		System.out.println(cm+"cm는 "+(int)ft+"피트 "+in+"인치입니다.");
	}
}