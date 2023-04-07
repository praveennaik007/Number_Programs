package Number_Programs;

public class Tech_Number {
public static void main(String[] args) {
int num=2025;
int temp=num;
int count=0;
while(num>0)
{
	num/=10;
	count++;
}
if(count%2==0)
{
	count/=2;
	int pow=1;
	for (int i = 1; i <= count; i++) {
		pow*=10;
	}
	int n1=temp%pow;
	int n2=temp/pow;
	int sum=n1+n2;
	int sq=sum*sum;
	if(sq==temp)
	{
		System.out.println("Tech Number ");
	}
	else
	{
		System.out.println("Not Tech Number ");
	}
}
else
{
	System.out.println("Odd Number ");
}
}
}
