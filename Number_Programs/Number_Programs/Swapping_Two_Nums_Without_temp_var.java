package Number_Programs;

public class Swapping_Two_Nums_Without_temp_var {
public static void main(String[] args) {
	int a=10;
	int b=20;
	System.out.println(a+" "+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a+" "+b);
}
}
