package org.bank.demo;

public class IobBank extends PersonalInfo{

	private void accNo() {
		// TODO Auto-generated method stub
		System.out.println("IOB Bank Account No: 7389293444");
	}
	
	private void ifsc() {
		// TODO Auto-generated method stub
		System.out.println("IOB IFSC NO : 4782945");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IobBank iobBank = new IobBank();
		iobBank.info();
		iobBank.accNo();
		iobBank.ifsc();

}

}