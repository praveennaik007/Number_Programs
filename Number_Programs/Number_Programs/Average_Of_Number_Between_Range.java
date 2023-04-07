package Number_Programs;

public class Average_Of_Number_Between_Range {
public static void main(String[] args) {
	int sum=0;
	int count=0;
	for (int i = 1; i <=10; i++) {
		sum+=i;
		count++;
	}
	int avg=sum/count;
	System.out.println(avg);
}
}
