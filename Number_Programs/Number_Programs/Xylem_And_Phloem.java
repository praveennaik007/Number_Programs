package Number_Programs;

public class Xylem_And_Phloem {
public static void main(String[] args) {
	int num=1234;
	int os=0;
	int is=0;
	int sum=0;
	os+=num%10;
	num/=10;
	while(num>9)
	{
		int d=num%10;
		is=num%10;
		sum+=is;
		num/=10;
	}
	os+=num;
	if(os==sum)
	{
		System.out.println("Xylem Number ");
	}
	else
	{
		System.out.println("Phloem Number ");
	}
}
}
