package Number_Programs;

public class Prime_Number_Range {
public static void main(String[] args) {
	int num1=40;
	int num2=70;
	
	for (int i = num1; i <= num2; i++) {
		//int count=0;
		boolean rs=true;
		int n=i;
		int j;
		for ( j = 2; j <n; j++) {
			if(n%j==0)
			{
				//count++;
				rs=false;
			}
		}
		//if(count==0)
		if(rs==true)
		{
			System.out.println("Prime Number "+j);
		}
	}
	
}
}
