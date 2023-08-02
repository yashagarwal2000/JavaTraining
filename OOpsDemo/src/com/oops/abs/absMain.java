package com.oops.abs;

public class absMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Branch1();
		bank.carLone();
		bank.educationLone();
		bank.admin();
		
		Branch1 branch1 = (Branch1)bank;
		branch1.getPay();
		
		bank = new SubBranch();
		bank.admin();
		bank.carLone();
		bank.educationLone();
		bank.homeLone();
		
		SubBranch subBranch = (SubBranch) bank;
		subBranch.loneType();
		subBranch.homeLone();
		
		Branch2 branch2 = (Branch2)bank;
		branch2.homeLone();
	}

}
