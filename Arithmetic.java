package Inheritance;

public class Arithmetic {
	int add(int a,int b)
	{
		return a+b;
	}
}
class Adder extends Arithmetic
{

}
public class Ex1 {
	 public static void main(String[] args) {
	        Adder a = new Adder();
	        int sum = a.add(22, 18); // 
	        System.out.println("sum : "+sum);
	    }
}

