import java.util.Scanner;

public class homework_p73_4 {
	public static void main(String args[]) {
		
		double f;
		double c;
		Scanner input = new Scanner(System.in);
		System.out.print("화씨 온도를 입력하십시오: ");
		f = input.nextDouble();
		c = 5*(f-32)/9;
		
		System.out.println("섭씨온도는 " + c + "입니다");
	}
}
