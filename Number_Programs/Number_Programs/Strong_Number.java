package Number_Programs;

public class Strong_Number {
public static void main(String[] args) {
	int num=145;
	int temp=num;
	int sum=0;
	while(num>0)
	{
	int fact=1;
	int d=num%10;
	for (int i = 1; i <= d; i++) {
		fact*=i;
	}
	sum+=fact;
	num/=10;
	}
	if(sum==temp)
	{
		System.out.println("Strong Number ");
	}
	else
	{
		System.out.println("Not Strong Number ");
	}
}
}
