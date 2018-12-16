package com.java.workshop.random;

public class TestPOJO {

	public static void main(String[] args) {
		
		POJO subPojo1 = new SubPOJO();
		SubPOJO subPojo2 = new SubPOJO();
		System.out.println("Pause");
		System.out.println(subPojo1.id);
		System.out.println(subPojo2.id);

	}

}
