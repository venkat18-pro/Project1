package org.bank.demo;

public class IcicBank extends PersonalInfo{

	private void accNo() {
		// TODO Auto-generated method stub
		System.out.println("ICIC Bank Account No: 7389293444");
	}
	
	private void ifsc() {
		// TODO Auto-generated method stub
		System.out.println("ICIC IFSC NO : 4782945");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IcicBank bank = new IcicBank();
		bank.info();
		bank.accNo();
		bank.ifsc();
	}

}
