package Abstract01;

class CalulatorController implements Calulator {

	public long add(long n1, long n2) {

		return n1 + n2;
	};

	public long substract(long n1, long n2) {

		return n1 - n2;
	};

	public long multiply(long n1, long n2) {

		return n1 * n2;
	};

	public double divide(double n1, double n2) {

		return n1 / n2;
	};

}
