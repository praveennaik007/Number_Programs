package Number_Programs;

public class Rverse_Number {
public static void main(String[] args) {
	int num=123;
	int rev=0;
	for (int i = num; i >0; i=i/10) {
		int d=i%10;
		rev=rev*10+d;
	}
	System.out.println(rev);
}
}
