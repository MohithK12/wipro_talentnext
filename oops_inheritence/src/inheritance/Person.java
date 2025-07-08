package inheritance;

public class Person {
	private String name;
	Person(){
		this.name="";
	}
	Person(String name){
		this.name=name;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name=name;
	}
}
