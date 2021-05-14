package com.test.workshop3.account;

public class Account {

	private String account;
	private String name;
	private int balance;

	public Account(String account, String name, int balance) throws InvalidValueException {
		// TODO ���� �Ա� �ݾ��� 0�� ������ ���, ���� �߻�
		this.account = account;
		this.name = name;
		this.balance = balance;
	}

	public void deposit(int money) throws InvalidValueException {
		// TODO �Ա��� �ݾ��� �߸� �Էµ� ���, ���� �߻�
		balance += money;
	}

	public void withdraw(int money) throws InvalidValueException {
		// TODO ����� �ݾ��� �߸� �ԷµǾ��ų�, �ܾ��� ������ ��� ���� �߻�
		balance -= money;
	}

	@Override
	public String toString() {
		return "[����] " + account + "\t[������] " + name + "\t[�ܾ�] " + balance;
	}
}