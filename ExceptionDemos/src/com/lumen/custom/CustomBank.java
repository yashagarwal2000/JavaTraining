package com.lumen.custom;

public class CustomBank {
	double balance;

	public CustomBank(double balance) {
		super();
		this.balance = balance;
	}

	void withdraw(double amount) throws ExtendingLimitException, NegativeBalanceException {
		if (amount > 1000) {
			throw new ExtendingLimitException("limit exceed");
		}
		if (balance - amount <= 0)
			throw new NegativeBalanceException("Balance is negative");
		balance = balance - amount;
		System.out.println("Balance " + balance);

//		
//		try {
//			System.out.println("In Bank");
//			if (amount > 1000)
//				throw new ArithmeticException("Exceeding limit");
//			balance -= amount;
//			System.out.println("Balance " + balance);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			throw e;
//		} finally {
//			System.out.println("close");
//		}
//		System.out.println("Completed");
//	}

	}

}
