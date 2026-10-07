package asdfghjkl;

public class Student {
	String name;
	int age;
	
	void introduce() {
		System.out.println("i am  "    +name+   "  age  "   +age);
	}
	public static void main(String[]args) {


Student s=new Student();
s.name="PUNITH";s.age=21;
s.introduce();
}
}