import java.util.Scanner;
public class practice2 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int 오백;
		int 백;
		int 오십;
		int 십;
		int 합;
		
		System.out.print("500원 개수 : ");
		오백 = input.nextInt();
		
		System.out.print("100원 개수 : ");
		백 = input.nextInt();
	 
		System.out.print("50원 개수 : ");
		오십 = input.nextInt();
		
		System.out.print("10원 개수 : ");
		십 = input.nextInt();
		
		합 = 500*오백+100*백+50*오십+10*십;
		
		System.out.println("돈의 액수 : "+합);
	}
}
