package Number_Programs;

public class Duck_Number {
public static void main(String[] args) {
	int num=01012;
	int count=0;
	while(num>0)
	{
		int d=num%10;
		if(d==0)
		{
			count++;
		}
		num/=10;
	}
	if(count>0)
	{
		System.out.println("Duck Number ");
	}
	else
	{
		System.out.println("Not Duck Number ");
	}
}
}
