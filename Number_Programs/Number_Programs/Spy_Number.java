package Number_Programs;

public class Spy_Number {
public static void main(String[] args) {
	int num=123;
	int sum=0;
	int prod=1;
	while(num>0)
	{
		int d1=num%10;
		int d2=num%10;
		sum+=d1;
		prod*=d2;
		num/=10;
	}
	if(sum==prod)
	{
		System.out.println("Spy Number ");
	}
	else
	{
		System.out.println("Not Spy Number ");
	}
}
}
