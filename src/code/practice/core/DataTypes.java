package code.practice.core;

import java.util.Scanner;

public class DataTypes {

	static Scanner sc = new Scanner(System.in);

	final double PI = 3.14159;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Byte.MIN_VALUE + " " + Byte.MAX_VALUE + " " + Byte.SIZE + " " + Byte.TYPE);
		System.out.println(Short.MIN_VALUE + " " + Short.MAX_VALUE + " " + Short.SIZE + " " + Short.TYPE);
		System.out.println(Integer.MIN_VALUE + " " + Integer.MAX_VALUE + " " + Integer.SIZE + " " + Integer.TYPE);
		System.out.println(Long.MIN_VALUE + " " + Long.MAX_VALUE + " " + Long.SIZE + " " + Long.TYPE);
		System.out.println(Float.MIN_VALUE + " " + Float.MAX_VALUE + " " + Float.SIZE + " " + Float.TYPE);
		System.out.println(Double.MIN_VALUE + " " + Double.MAX_VALUE + " " + Double.SIZE + " " + Double.TYPE);

		boolean happy = true;
		char chr = 'A';// \n \t \f \t \r \" \' \\
		float f = 1.1111111111111111111111111111F; // 6 point precision
		double d = 1.111111111111111111111111111111111; // 15 point precision
		double d2 = 1e+3;
		long l = 1213434565;
		long l2 = 123_456_789;

		System.out.println(happy);
		System.out.println(f);
		System.out.println(chr);
		System.out.println(d);
		System.out.println(d2);
		System.out.println(l);
		System.out.println(l2);

		int smInt = 100;
		long smLong = 12142235;
		long upLong = smInt;
		double dbl = 1.234;
		int cInt = (int) dbl;
		Long bigL = 2147486470L;
		// int bInt = (int) bigL;
		System.out.println(cInt);
		// System.out.println(bInt);
		String s = Double.toString(1.34566);
		System.out.println(s);

		System.out.println(Byte.parseByte("10"));
		System.out.println(Short.parseShort("10111"));
		System.out.println(Integer.parseInt("10111111"));
		System.out.println(Long.parseLong("1022323"));
		System.out.println(Float.parseFloat("102e+3"));
		System.out.println(Double.parseDouble("1022323.12343546"));
	}

}
