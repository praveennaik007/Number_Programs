package Number_Programs;

public class SquareRoot_Number {
public static void main(String[] args) {
	int num=36;
	boolean rs=false;
	int i; 
	for (i=1; i <=num/2; i++) {
		if(i*i==num)
		{
		rs=true;
		break;
		}
	}
	if(rs)
	{
		System.out.println("Square Root Number "+i);
	}
	else
	{
		System.out.println("Not a Square Root Number "+i);
	}
}
}
