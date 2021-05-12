package sample0512;

class Myclass {
	protected int myVal;

	void myMethod() {
		System.out.println(this.myVal);
	}
}

class Myclass2 extends Myclass {
	void myMethod2() {
		super.myVal = 5;
		super.myMethod();

	}
}

public class sample07 {

	public static void main(String[] args) {
		Myclass2 myc = new Myclass2();
		myc.myMethod2();

	}

}
