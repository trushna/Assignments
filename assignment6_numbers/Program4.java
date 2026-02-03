package assignment6_numbers;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=5678;
int newnum=0;
int count=0;
while(num>0)
{
	count++;
	int lastdigit=num%10;
	if(count==2)
		newnum=lastdigit*10+newnum;
	else if(count==4)
		newnum=lastdigit*1000+newnum;
	num=num/10;
}
System.out.println(newnum);
	}

}
