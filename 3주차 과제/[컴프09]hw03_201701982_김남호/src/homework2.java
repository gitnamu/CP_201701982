import java.util.Scanner;
public class homework2 {
	public static void main(String[] args) {
		 int h,w;
	      double c;
	      Scanner input = new Scanner(System.in);
	      System.out.print("Ű�� �Է��Ͻÿ�: ");
	      h = input.nextInt();
	      System.out.print("�����Ը� �Է��Ͻÿ�: ");
	      w = input.nextInt();
	      c = (h-100)*0.9;
	      if(c+0.1*c<w) 
	          System.out.println("��ü���Դϴ�");
	      else if(w<c-0.1*c) 
	            System.out.println("��ü���Դϴ�");
	         else
	            System.out.println("�����Դϴ�");
	            
	      
	   }
	}