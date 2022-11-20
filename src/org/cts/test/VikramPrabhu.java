package org.cts.test;

public class VikramPrabhu extends Prabhu {
	
	public void propertyInfor() {
		System.out.println("My name is vikram prabhu - property value is 30000 USD");
		System.out.println("Branch is hariharan - making some changes");
	}

	public static void main(String[] args) {
		
		VikramPrabhu v = new VikramPrabhu();
		v.propertyInfor();
		v.propertyDetails();
		v.propertyInfo();
	}
}
