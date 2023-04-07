package Number_Programs;

public class Gcd_Of_Two_Numbers {
public static void main(String[] args) {
	int num1=2;
	int num2=4;
	int gcd=0;
	for (int i = 1; i <=num1%10&&i<=num2%10; i++) {
		if(num1%i==0&&num2%i==0)
		{
			gcd=i;
		}
	}
	System.out.println("Greates common divisor "+ gcd);
}
}
