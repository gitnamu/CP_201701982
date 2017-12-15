import java.util.Random;
public class homework {
	public static void main(String args[]) {
		int num1=0,num2=0,num3=0,num4=0,num5=0,num6=0;
		int i,j;
		Random rand = new Random(System.currentTimeMillis());
		for(i=1;i<7;i++) {
			j = rand.nextInt(45)+1;
			switch(i) {
			case 1:
				num1 = j;
				break;
			case 2:
				num2 = j;
				while(num1==num2)
				num2=rand.nextInt(45)+1;
				break;
			case 3:
				num3 = j;
				while(num1==num3||num2==num3)	
					num3=rand.nextInt(45)+1;
				break;
			case 4:
				num4 = j;
				while(num1==num4||num2==num4||num3==num4)	
					num4=rand.nextInt(45)+1;
				break;
			case 5:
				num5 = j;
				while(num1==num5||num2==num5||num3==num5||num4==num5)	
					num5=rand.nextInt(45)+1;
				break;
			case 6:
				num6 = j;
				while(num1==num6||num2==num6||num3==num6||num4==num6||num5==num6)	
					num6=rand.nextInt(45)+1;
				break;
			}
		}
	System.out.println("<로또 생성 프로그램>");
	System.out.println(num1+" "+ num2+" "+num3+" "+num4+" "+num5+" "+num6);
	}
}