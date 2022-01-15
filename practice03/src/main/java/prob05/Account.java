package prob05;

public class Account {
	private String accountNo;
	private int balance;

	Account(String str) {
		accountNo = str;
		balance = 0;
		System.out.println(accountNo+" 계좌가 개설되었습니다. ");
	}
	
	protected void save(int money) {
		balance += money;
		System.out.println(accountNo+" 계좌에 "+money+"만원이 입금되었습니다.");
	}
	
	protected void deposit(int money) {
		balance -= money;
		System.out.println(accountNo+" 계좌에 "+money+"만원이 출금되었습니다.");
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
