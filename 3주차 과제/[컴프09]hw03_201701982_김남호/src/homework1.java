import java.util.Scanner;
public class homework1 {
	public static void main(String args[]) {
		int a,b,c;
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�: ");
		a = input.nextInt();
		System.out.print("������ �Է��Ͻÿ�: ");
		b = input.nextInt();
		System.out.print("������ �Է��Ͻÿ�: ");
		c = input.nextInt();
		if(a<b)
			if(b<c)
				System.out.println("���ĵ� ����: "+a+" "+b+" "+c);
			else if(a<c)
				System.out.println("���ĵ� ����: "+a+" "+c+" "+b);
			else
				System.out.println("���ĵ� ����: "+c+" "+a+" "+b);
		else if(c<a)
			System.out.println("���ĵ� ����: "+c+" "+b+" "+a);
		else if(b<c)
			System.out.println("���ĵ� ����: "+b+" "+a+" "+c);
		else
			System.out.println("���ĵ� ����: "+b+" "+c+" "+a);

	}
}