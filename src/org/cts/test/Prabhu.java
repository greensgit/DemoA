package org.cts.test;

public class Prabhu extends SivajiDetails{
	
	public void propertyDetails() {

		System.out.println("My name is Prabhu - Property value is 100000 USD");
		System.out.println("My branch is Anusha");
	}

	
	//rule 1 - last child class main method
	
	public static void main(String[] args) {
		
		Prabhu p = new Prabhu();
		p.propertyDetails();
		p.propertyInfo();
	}
	

}
