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
		Member customer1 = new Member("111-222-33333333", "������", 20000);
		Member customer2 = new Member("555-666-77777777", "���ſ�", 100000);
		System.out.println("�⺻ ������");
		printAccount(customer1);
		printAccount(customer2);
		System.out.println("�ѹ��� �����");
		customer1.deposit(1000000);
		customer2.withdraw(30000);
		printAccount(customer1);
		printAccount(customer2);
		System.out.println("�������� ���");
		Member.interest = 0.05;
		customer1.addInterest(); // ����� �ݾ�=����+����*������
		customer2.addInterest();// ����� �ݾ�=����+����*������
		printAccount(customer1);
		printAccount(customer2);
	}

	static void printAccount(Member customer) {
		System.out.println("���¹�ȣ:" + customer.getAccountNo());
		System.out.println("�������̸�:" + customer.getAccountName());
		System.out.println("�ܾ�:" + customer.getBalance());
		System.out.println();
	}
}
