package com.dhanush.designpattren;
class Early{
	//when the class is load is the object is created beacus of static varaibles
	static Early e=new Early();
	private Early() {
		
	}
	static Early getInstance(){
		return e;
	}
}
public class EarlySingleton {

	public static void main(String[] args) {
		
		Early e1=Early.getInstance();
		System.out.println(e1);
		Early e2=Early.getInstance();
		System.out.println(e2);
		Early e3=Early.getInstance();
		System.out.println(e3);
	}

}
