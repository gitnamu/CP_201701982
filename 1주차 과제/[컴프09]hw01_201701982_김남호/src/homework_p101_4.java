import java.util.Scanner;
public class homework_p101_4 {
	public static void main(String args[]) {
		int r;
		int h;
		double v;
		final double p = 3.141592;
		Scanner input = new Scanner(System.in);
		System.out.print("원기둥 밑면의 반지름을 입력하시오: ");
		r = input.nextInt();
		System.out.print("원기둥의 높이를 입력하시오: ");
		h = input.nextInt();
		
		v = r*r*p*h;
		System.out.println("원기둥의 부피는 "+v+"입니다.");
	}
}
