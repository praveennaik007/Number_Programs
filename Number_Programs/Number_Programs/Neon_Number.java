package Number_Programs;

public class Neon_Number {
public static void main(String[] args) {
	int num=9;
	int sq=num*num;
	int sum=0;
	while(sq>0)
	{
		int d=sq%10;
		sum+=d;
		sq/=10;
	}
	if(num==sum)
	{
		System.out.println("Neon Number ");
	}
	else
	{
		System.out.println("Not Neon Number ");
	}
}
}
