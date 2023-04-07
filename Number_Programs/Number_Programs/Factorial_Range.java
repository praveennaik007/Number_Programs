package Number_Programs;

public class Factorial_Range {
public static void main(String[] args) {
	
for (int i = 1; i <=5; i++) {
	int n=i; int fact=1;
	for (int j = 1; j <=n; j++) {
		fact*=j;
	}
	System.out.println(fact);
}
}
}
