import java.util.Scanner;
class Isprime{
public static void main(String[] args){
	int a, i,j,count;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	a=sc.nextInt();
	 for(i=1;i<=a;i++){
	  count=0;
	for(j=1;j<=i;j++){
		if(i%j==0)
		   count++;
		}
		if(count==2)
		  System.out.println(i+"is prime");
}
}
}