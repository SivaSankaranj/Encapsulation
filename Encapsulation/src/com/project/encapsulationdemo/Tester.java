package com.project.encapsulationdemo;

public class Tester {
	
	public static void main(String[] args) {
		
		School school=new School();
		school.setSerialNo(8965);
		school.setName("Maxwell Matriculation");
		school.setStrength(500);
		school.setFees(30000);
		school.setLocation("Thanjavur");
		
		System.out.println("SerialNo:"+school.getSerialNo());
		System.out.println("Name:"+school.getName());
		System.out.println("Strength:"+school.getStrength());
		System.out.println("Fees:"+school.getFees());
		System.out.println("Location:"+school.getLocation());
		
		
		
	}

}
