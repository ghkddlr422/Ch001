package Ch001;

public class VarArgsTest {

	public static void main(String[] args) {
		foo("æ»≥Á", 1);
		foo("æ»≥Á«œººø‰", 1, 2);
		foo("¿ﬂ ¿÷æÓ");
	}
	public static void foo(String a, int b) {
		System.out.println(a + " " + b);
	}
	public static void foo(String a, int b, int c) {
		System.out.println(a + " " + b + " " + c);
	}
	public static void foo(String a) {
		System.out.print(a);
	}
}
