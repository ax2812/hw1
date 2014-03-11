import java.util.*;
public class TEST12 {
public static void main(String[] args ){
	Scanner input = new Scanner(System.in);	
	System.out.print("Please enter a number of x\n");
		double x = input.nextDouble();
		AbstractDrawFunction f1 = new Fuction1();
		System.out.print("If x = "+ x + "\nf(x) = x*x  \nf(x) = "+ f1.f(x) + "\n");
		AbstractDrawFunction f2 = new Fuction2();
		System.out.print("If x = "+ x + "\nf(x) = sin(x)  \nf(x) = "+ f2.f(x) + "\n");
		AbstractDrawFunction f3 = new Fuction3();
		System.out.print("If x = "+ x + "\nf(x) = cos(x)  \nf(x) = "+ f3.f(x) + "\n");
		AbstractDrawFunction f4 = new Fuction4();
		System.out.print("If x = "+ x + "\nf(x) = tan(x)  \nf(x) = "+ f4.f(x) + "\n");
		AbstractDrawFunction f5 = new Fuction5();
		System.out.print("If x = "+ x + "\nf(x) = cos(x) + 5sin(x)  \nf(x) = "+ f5.f(x) + "\n");
		AbstractDrawFunction f6 = new Fuction6();
		System.out.print("If x = "+ x + "\nf(x) = 5cos(x) + sin(x)  \nf(x) = "+ f6.f(x) + "\n");
		AbstractDrawFunction f7 = new Fuction7();
		System.out.print("If x = "+ x + "\nf(x) = log(x) + x*x  \nf(x) = "+ f7.f(x) + "\n");
	
}
}
