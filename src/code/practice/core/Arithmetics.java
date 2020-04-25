package code.practice.core;

public class Arithmetics {
	public static void main(String [] args) {
		
		System.out.println("5 + 4 = " + (5+4));
		System.out.println("5 - 4 = " + (5-4));
		System.out.println("5 * 4 = " + (5*4));
		System.out.println("5 / 4 = " + (5/4));
		System.out.println("5 % 4 = " + (5%4));
		
		System.out.println("5.0 + 4 = " + (5.0+4.0));
		System.out.println("5 / 4 = " + (5.0/4));
		
		int i =33;		
		System.out.println(i++);
		System.out.println(++i);
		System.out.println(i--);
		System.out.println(--i);
		
		System.out.println(i+=10);
		System.out.println(i-=10);
		System.out.println(i/=10);
		System.out.println(i*=10);
		System.out.println(i%=10);		
	}
}
