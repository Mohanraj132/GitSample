package org.test;

public class GreenBank extends IndianBank{

	@Override
	public void Saving() {
		System.out.println("6%");
	}

	@Override
	public void Fixed() {
        System.out.println("9");		
	}
	public static void main(String[] args) {
		GreenBank b=new GreenBank();
		b.Saving();
		b.Fixed();
		b.deposit();
	}

}
