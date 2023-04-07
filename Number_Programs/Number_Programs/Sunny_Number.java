package Number_Programs;


public class Sunny_Number {
public static void main(String[] args) {	
int num=8;
int sq=num+1;
boolean rs= false;
for (int i = 1; i < sq; i++) {
	if(i*i==sq)
	{
		rs=true;
		break;
	}
}
if(rs)
{
	System.out.println("Sunny Number ");
}
else
{
	System.out.println("Not Sunny Number ");
}
}
}
