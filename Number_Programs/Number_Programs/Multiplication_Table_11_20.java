package Number_Programs;

public class Multiplication_Table_11_20 {
public static void main(String[] args) {
	
	for (int i = 11; i <= 20; i++) {
		
		int n=i;
		for (int j = 1; j <= 10; j++) {
			int x=n*j;
			System.out.println(n+"* "+j+"= "+x);
		}	
	}
}
}
