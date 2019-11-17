package workplacecommunication;

public class Person {
	public boolean like;
	public String post;
	public String name;
	public String greet;

	Person(boolean like, String post, String name, String greet) {
		this.like = like;
		this.name = name;
		this.post = post;
		this.greet = greet;

	}

	Person(String name, String greet) {
		this.name = name;
		this.greet = greet;

	}

	public String sPost() {
		if (this.post == null) {
			return "";
		} else {
			return this.post;
		}
	}

	public void printData() {
		
		
		System.out.println(this.like + " " + this.sPost() + ":  " + this.name + "  " + this.greet);

	}

}
