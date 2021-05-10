package sample0510;

class Member {

	public static double interest;
	private String num;
	private String name;
	private double money;

	public Member(String num, String name, int money) {
		this.num = num;
		this.name = name;
		this.money = money;
	}

	public String getAccountNo() {

		return this.num;
	}

	public String getAccountName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	public double getBalance() {
		// TODO Auto-generated method stub
		return this.money;
	}

	public void deposit(int i) {
		money += i;

	}

	public void withdraw(int i) {
		money -= i;

	}

	public void addInterest() {
		money = money + (money * interest);
	}

}

public class SampleMoney {

	public static void main(String[] args) {
		Member customer1 = new Member("111-222-33333333", "최은희", 20000);
		Member customer2 = new Member("555-666-77777777", "남매월", 100000);
		System.out.println("기본 적립금");
		printAccount(customer1);
		printAccount(customer2);
		System.out.println("한번의 입출금");
		customer1.deposit(1000000);
		customer2.withdraw(30000);
		printAccount(customer1);
		printAccount(customer2);
		System.out.println("이자율의 계산");
		Member.interest = 0.05;
		customer1.addInterest(); // 저축된 금액=원금+원금*이자율
		customer2.addInterest();// 저축된 금액=원금+원금*이자율
		printAccount(customer1);
		printAccount(customer2);
	}

	static void printAccount(Member customer) {
		System.out.println("계좌번호:" + customer.getAccountNo());
		System.out.println("예금주이름:" + customer.getAccountName());
		System.out.println("잔액:" + customer.getBalance());
		System.out.println();
	}
}
