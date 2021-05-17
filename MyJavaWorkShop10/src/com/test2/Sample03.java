package com.test2;
class MyException extends Exception {
	MyException(String msg){
		super(msg);
	}
}
public class Sample03 {
	static void checkMethod(int num) throws MyException {
		if (num % 2 == 0) {
			throw new MyException("짝수입니다.");
		}
	}
	public static void main(String[] args) {
		try {
			throw new MyException("나의 오류입니다.");
		} catch(MyException ex) {
			System.out.println("오류입니다." + ex.getMessage());
		}
//		checkMethod(1);
		try {
			checkMethod(2);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Exception ex = new Exception("테스트입니다.");
//		try {
//			throw ex;
//		} catch (Exception e) {
//			System.out.println(ex.getMessage());
//		}
	}

}
