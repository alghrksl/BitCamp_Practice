package GetterSetter;

public class MemberSub {

	private String name;
	private String phonNum;
	private String major;
	private int grade;
	private String email;
	private String birth;
	private String address;

	MemberSub(String name, String phonNum, String major, int grade, String email) {

		this(name, phonNum, major, grade, email, null, null);
	} // 5개만 받을 수 있는 생성자

	MemberSub(String name, String phonNum, String major, int grade, String email, String birth, String address) {
		this.name = name;
		this.phonNum = phonNum;
		this.major = major;
		this.grade = grade;
		this.email = email;
		this.birth = birth;
		this.address = address;
	}// 모두 받을 수 있는 생성자

// 게터 세터 구간 -----------------------------

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhonNum() {
		return phonNum;
	}

	public void setPhonNum(String phonNum) {
		this.phonNum = phonNum;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

// 게터 세터 구간 -----------------------------		

	void showdata() {
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + phonNum);
		System.out.println("전공: " + major);
		System.out.println("학년: " + grade);
		System.out.println("이메일: " + email);
		
		if (this.birth == null) {
			System.out.println("생일: ");
		} else {
			System.out.println("생일: " + birth);
		}

		if (this.address == null) {
			System.out.println("주소: ");
		} else {
			System.out.println("주소: " + address);
		}
	}
}
