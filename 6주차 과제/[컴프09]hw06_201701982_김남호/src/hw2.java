import java.util.Scanner;

public class hw2 {
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		String id, pw, idc, pwc;
		System.out.println("<��������>");
		System.out.print("���̵� �Է��Ͻÿ�:");
		id = input.nextLine();
		System.out.print("��й�ȣ�� �Է��Ͻÿ�:");
		pw = input.nextLine();
		
		System.out.println("");
		System.out.println("<�α���>");
		System.out.print("ID:");
		idc = input.nextLine();
		System.out.print("PW:");
		pwc = input.nextLine();
		
		System.out.println(check(id, idc, pw, pwc));
	}
	public static String check(String a, String b, String c, String d) {
			if(a.equals(b) && c.equals(d))
				return "�α��ο� �����Ͽ����ϴ�.";
			else return "�α��ο� �����Ͽ����ϴ�";
	}
}