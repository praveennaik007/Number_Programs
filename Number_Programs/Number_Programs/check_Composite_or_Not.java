package Number_Programs;

public class check_Composite_or_Not {
public static void main(String[] args) {
	int num=6;
	int count=0;
	for (int i = 2; i < num; i++) {
		if(num%i==0)
		{
			count++;
		}
	}
	if(count>0)
	{
		System.out.println("Composite Number ");
	}
	else
	{
		System.out.println("Not Composite Number 0");
	}
}
}
