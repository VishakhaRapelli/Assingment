import java.util.Scanner;
class Primescanner
{
public static void main(String args[])
{
int year,i,count=0;
System.out.println("Enter the year:");
Scanner sc=new Scanner(System.in);
year=sc.nextInt();
for(i=2;i<year;i++)
{
if(year%i==0)
{
count++;
break;
}
}
if(count==0)
System.out.println("\nIt is a prime year");
else
System.out.println("\nIt is not  a prime year");
}
}
