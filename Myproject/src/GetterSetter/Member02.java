package GetterSetter;

public class Member02 {

//	1. Member 클래스에는 아래 요구사항에 맞는 변수와 메소드를 정의하고, 
//  main()메소드 에 해당 메소드를 호출해서 결과를 확인해보세요. 

//		단 인스턴스의 생성은 생성자를 이용해서 초기화하는 코드를 작성해 봅시다. 
//		① 아래의 데이터를 저장 이름, 전화번호, 전공, 학년, email, 생일, 주소
//		② 위에서 정의한 정보를 출력하는 메소드 정의
//		③ 모든 정보를 저장하도록 하는 생성자와 생일과 주소는 저장하지 않을 수 있는 생성자를 정의
//		④ main() 메소드에서 두 가지 생성자를 이용해서 인스턴스 생성하고 출력 메소드를 통해 저장된 데이터 출력

	public static void main(String[] args) {
		MemberSub member1 = new MemberSub("김훈", "010-0000-0000", "국문", 4, "aaa@aaa.com");
		MemberSub member2 = new MemberSub("이진형", "010-0000-0001", "영문", 3, "aaa@aaa.com", "1996-04-13", "구로");
		member1.showdata();

	}
}
