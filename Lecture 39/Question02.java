package q11292;
public class StaticMethodDemo {
	public static void main(String[] args) {
		A a1 = new A(3);
		A a2 = new A(4);
		System.out.println("a1 = " + a1);
		System.out.println("a2 = " + a2);
		System.out.println("A.getInstanceCount() = " + A.getInstanceCount());
	}
}
class A {
	private static int counter;
	private int instanceField;
	public A(int instanceField) {
		this.instanceField = instanceField;
		counter++;
	}
	public static int getInstanceCount() {
		return counter;
	}
	public String toString() {
		return "A [instanceField = " + instanceField + ", counter = " + counter + "]";
	}
}
