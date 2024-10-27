package com.dhanush.designpattren;
class Dog{
	
	static Dog d;
	private Dog() {
		
	}
	
	static Dog getInstance(){
		if(d==null) {
			
			d=new Dog();
		}
	
		return d;
	}
}
public class Signleton {

	public static void main(String[] args) {
		
		Dog d1=Dog.getInstance();
		System.out.println(d1);
		Dog d2=Dog.getInstance();
		System.out.println(d2);
		Dog d3=Dog.getInstance();
		System.out.println(d3);
		Dog d4=Dog.getInstance();
		System.out.println(d4);
		
	
	
	}

}
