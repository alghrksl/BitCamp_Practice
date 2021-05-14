public class Sample12 {
	public static void main(String[] args) {
		try {
			throw new ArithmeticException();
		} catch(ArithmeticException ex) {
			System.out.println("ArithmeticException");
		}
	}
} 
// 페이지 418 8-3
// 페이지 422 8-8
// 페이지 425 8-9
