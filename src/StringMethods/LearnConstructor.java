package StringMethods;

public class LearnConstructor {
	void NormalMethod() {
		System.out.println("Normal Method");
		
	}
	LearnConstructor(String str){
		System.out.println("Constructor" + str);
	}
	
	public static void main(String[] args) {
		LearnConstructor obj=new LearnConstructor(" a Special Method");
		obj.NormalMethod();
	}

}
