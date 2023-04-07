package Number_Programs;

public class Automorfic_Number {
public static void main(String[] args) {
	int num=25;
	int sq=num*num;
	boolean rs=false;
	while(num>0)
	{
		if(num%10==sq%10)
		{
			rs=true;
			
			num/=10;
			sq/=10;
		}
	}
	if(rs)
	{
		System.out.println("Automorfic Number ");
	}
	else
	{
		System.out.println("Not Automorfic Number ");
	}
}
}
