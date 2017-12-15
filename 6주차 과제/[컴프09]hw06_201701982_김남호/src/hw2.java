import java.util.Scanner;

public class hw2 {
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		String id, pw, idc, pwc;
		System.out.println("<계정생성>");
		System.out.print("아이디를 입력하시오:");
		id = input.nextLine();
		System.out.print("비밀번호를 입력하시오:");
		pw = input.nextLine();
		
		System.out.println("");
		System.out.println("<로그인>");
		System.out.print("ID:");
		idc = input.nextLine();
		System.out.print("PW:");
		pwc = input.nextLine();
		
		System.out.println(check(id, idc, pw, pwc));
	}
	public static String check(String a, String b, String c, String d) {
			if(a.equals(b) && c.equals(d))
				return "로그인에 성공하였습니다.";
			else return "로그인에 실패하였습니다";
	}
}