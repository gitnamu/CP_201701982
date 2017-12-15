
import java.util.Scanner;
public class practice3 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int 평;
		double 평방미터;
		
		System.out.print("평 수를 입력하시오 : ");
		평 = input.nextInt();
		
		평방미터 = 평*3.3058;
		
		System.out.println(평+"평은 "+평방미터+"평방미터입니다.");
	 
	}
}