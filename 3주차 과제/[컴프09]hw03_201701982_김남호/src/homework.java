
public class homework {
	public static void main(String args[]) {
		int a, b, c;
		for(a=1;a<=5;a++) {
			for(b=1;b<=5-a;b++) {
				System.out.print(" ");
			}
				for(c=1;c<a*2;c++) {
					System.out.print("*");
				}
			System.out.print("\n");
		}
		for(a=1;a<=4;a++) {
			for(b=1;b<=a;b++) {
				System.out.print(" ");	
			}
			for(c=1;c<(5-a)*2;c++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
