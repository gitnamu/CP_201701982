import java.util.Scanner;
public class homework2 {
	public static void main(String[] args) {
		 int h,w;
	      double c;
	      Scanner input = new Scanner(System.in);
	      System.out.print("키를 입력하시오: ");
	      h = input.nextInt();
	      System.out.print("몸무게를 입력하시오: ");
	      w = input.nextInt();
	      c = (h-100)*0.9;
	      if(c+0.1*c<w) 
	          System.out.println("과체중입니다");
	      else if(w<c-0.1*c) 
	            System.out.println("저체중입니다");
	         else
	            System.out.println("정상입니다");
	            
	      
	   }
	}