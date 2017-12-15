import java.util.Scanner;
public class homework1 {
	public static void main(String args[]) {
		int a,b,c;
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		a = input.nextInt();
		System.out.print("정수를 입력하시오: ");
		b = input.nextInt();
		System.out.print("정수를 입력하시오: ");
		c = input.nextInt();
		if(a<b)
			if(b<c)
				System.out.println("정렬된 숫자: "+a+" "+b+" "+c);
			else if(a<c)
				System.out.println("정렬된 숫자: "+a+" "+c+" "+b);
			else
				System.out.println("정렬된 숫자: "+c+" "+a+" "+b);
		else if(c<a)
			System.out.println("정렬된 숫자: "+c+" "+b+" "+a);
		else if(b<c)
			System.out.println("정렬된 숫자: "+b+" "+a+" "+c);
		else
			System.out.println("정렬된 숫자: "+b+" "+c+" "+a);

	}
}