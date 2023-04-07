package Number_Programs;

public class Given_Number_Starts_With_Even_Or_Not {
public static void main(String[] args) {
	int num=2234;
	while(num>9)
	{
		int d=num%10;
		num/=10;
	}
	if(num%2==0)
	{
		System.out.println("Number Starts with Even Number");
	}
	else
	{
		System.out.println("Not Starts with Even Number ");
	}
}
}
