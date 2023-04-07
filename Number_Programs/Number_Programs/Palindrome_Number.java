package Number_Programs;

public class Palindrome_Number {
public static void main(String[] args) {
	
	int num=1221;
	int temp=num;
	int rev=0;
	for (int i = num; i >0; i=i/10) {
		int d=i%10;
		rev=rev*10+d;
	}
	if(rev==temp)
	{
		System.out.println("Palindrome ");
	}
	else
	{
		System.out.println("Not Palindrome ");
	}
}
}
