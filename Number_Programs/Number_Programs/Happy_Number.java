package Number_Programs;

public class Happy_Number {
public static void main(String[] args) {
	int num=19;
	while(num>9)
	{
	int sum=0;
	while(num>0)
	{
		int d=num%10;
		sum+=d*d;
		num/=10;
	}
	num=sum;
	}
	
	if(num==1 || num==7)
	{
		System.out.println("Happy Number ");
	}
	else
	{
		System.out.println("Not Happy Number ");
	}
}
}
