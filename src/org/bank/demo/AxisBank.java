package org.bank.demo;

public class AxisBank extends PersonalInfo{

	private void accNo() {
		// TODO Auto-generated method stub
		System.out.println("Axis Bank Account No: 37389293444");
	}
	
	private void ifsc() {
		// TODO Auto-generated method stub
		System.out.println("Axis IFSC NO : 5782945");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank axisBank = new AxisBank();
		axisBank.info();
		axisBank.accNo();
		axisBank.ifsc();

}
	
}