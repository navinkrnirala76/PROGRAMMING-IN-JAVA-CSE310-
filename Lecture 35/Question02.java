package q11280;
public class EqualsExample {
	public static void main(String[] args) {
		A a1 = new A(4);
		A a2 = new A(5);
		A a3 = new A(4);
		System.out.println("a1.equals(a2) : " + a1.equals(a2));
		System.out.println("a1.equals(a3) : " + a1.equals(a3));
		B b1 = new B(4);
		B b2 = new B(5);
		B b3 = new B(4);
		System.out.println("b1.equals(b2) : " + b1.equals(b2));
		System.out.println("b1.equals(b3) : " + b1.equals(b3));
	}
}
class A {
	private int value;
	public A(int value) {
		this.value = value;
	}
	public boolean equals(Object otherObject) {
		if (this == otherObject) {
			return true;
		}
		if (otherObject instanceof A) {
			A otherARef = (A) otherObject;
			return (this.value == otherARef.value);
		} else {
			return false;
		}
	}
}
class B {
	private int value;
	public B(int value) {
		this.value = value;
	}
}
