package Number_Programs;

public class Sum_Of_All_Prime_Number {
public static void main(String[] args) {
	int sum=0;
	int j;
	for (int i = 11; i <= 20; i++) {
		int num=i;
		int count=0;
		for ( j = 1; j <= num; j++) {
		//for ( j =2; j < num; j++) {
			if(num%j==0)
			{
				count++;
			}
		}
		if(count==2) {
		//if(count==0){
		
			//System.out.println(i);
			sum+=i;	
		}
	}
	System.out.println(sum);
}
}
