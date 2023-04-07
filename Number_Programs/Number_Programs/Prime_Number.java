package Number_Programs;

public class Prime_Number {
public static void main(String[] args) {
	int num=13;
	//int count=0;
	boolean rs=true;
	for (int i = 2; i <=num/2; i++) 
	{
		
		if(num%i==0)
		{
			rs=false;
			//count++;
		}
		
	}
	//if(count==0)
	if(rs==true)
	{
		System.out.println("Prime Number ");
	}
	else
	{
		System.out.println("Not Prime Number ");
	}
	}


}
