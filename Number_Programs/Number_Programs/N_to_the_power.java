package Number_Programs;

public class N_to_the_power {
public static void main(String[] args) {
	int num=5;
	int pow=3;
	int res=1;
	for (int i = 1; i <=pow; i++) {
		res*=num;
	}
	System.out.println(res);
}
}
