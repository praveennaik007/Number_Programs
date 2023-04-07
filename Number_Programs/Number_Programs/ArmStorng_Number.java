package Number_Programs;

public class ArmStorng_Number {
public static void main(String[] args) {
	int num=153;
	int temp=num;
	int count=0;
	while(num>0)
	{
		num/=10;
		count++;
	}
	num=temp;
	int sum=0;
	while(num>0)
	{
		int fact=1;
		int d=num%10;
		for (int i = 1; i <=count; i++) {
			fact*=d;
		}
		sum+=fact;
		num/=10;
	}
	if(sum==temp)
	{
		System.out.println("ArmStrong Number ");
	}
	else
	{
		System.out.println("Not ArmStrong Number ");
	}
}
}
