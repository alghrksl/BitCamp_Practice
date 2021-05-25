class Account {
	private String accountNo;
	private String accountName;
	private double balance;
	public static double interest;

	public Account(String accountNo, String accountName, int balance) {
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.balance = balance;
	}

	public String getAccountNo() {
		return this.accountNo;
	}

	public String getAccountName() {
		return this.accountName;
	}

	public double getBalance() {
		return this.balance;
	}

	public void deposit(int price) {
		this.balance += price;
		// this.balance = this.balance + price;
	}

	public void withdraw(int price) {
		this.balance -= price;
		// this.balance = this.balance - price;
	}

	public void addInterest() {
		balance = balance + (balance * interest);
	}
}

public class AccountTest {
	public static void main(String[] args) {
		Account customer1 = new Account("111-222-33333333", "������", 20000);
		Account customer2 = new Account("555-666-77777777", "���ſ�", 100000);
		System.out.println("�⺻ ������");
		printAccount(customer1);
		printAccount(customer2);
		System.out.println("�ѹ��� �����");
		customer1.deposit(1000000);
		customer2.withdraw(30000);
		printAccount(customer1);
		printAccount(customer2);
		System.out.println("�������� ���");
		Account.interest = 0.05;
		customer1.addInterest(); // ����� �ݾ�=����+����*������
		customer2.addInterest();// ����� �ݾ�=����+����*������
		printAccount(customer1);
		printAccount(customer2);
	}

	static void printAccount(Account customer) {
		System.out.println("���¹�ȣ:" + customer.getAccountNo());
		System.out.println("�������̸�:" + customer.getAccountName());
		System.out.println("�ܾ�:" + customer.getBalance());
		System.out.println();
	}
}