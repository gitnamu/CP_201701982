import java.util.Scanner;
public class Theater {
	public static void main(String[] args) {
		int seat[] = new int[10];
		Scanner input = new Scanner(System.in);
		do {
		System.out.print("좌석을 예약하시겠습니까? (1 또는 0) ");
		int reservation = input.nextInt();
		if(reservation == 1) {
			System.out.println("---------------------------------");
			System.out.println("  1  2  3  4  5  6  7  8  9  10");
			System.out.println("---------------------------------");
			for(int i = 0;i<seat.length;i++)
				System.out.print(seat[i]+"  ");
				System.out.println("");
			System.out.print("몇번째 좌석을 예약하시겠습니까? ");
			int num = input.nextInt();
			if(seat[num - 1] == 0) {
				System.out.println("예약되었습니다.");
				seat[num - 1] = 1;
				}
			else
				System.out.println("이미 예약된 좌석입니다.");
		}
		else if(reservation == 0) {
			System.out.println("취소되었습니다.");
			break;
			
		}
		else
			System.out.println("1 또는 0만 입력해주십시오.");
	
		} while(true);

	}
}