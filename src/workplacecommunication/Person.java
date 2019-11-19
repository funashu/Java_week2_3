package workplacecommunication;

public class Person {
	public String like;
	public String post;
	public String name;
	public String greet;

	Person(String like, String post, String name, String greet) {
		this.like = like;
		this.name = name;
		this.post = post;
		this.greet = greet;

	}

	Person(String post, String name, String greet) {
		this.name = name;
		this.greet = greet;
		this.post = post;

	}

	Person(String name, String greet) {
		this.name = name;
		this.greet = greet;

	}

	public String sLike() {
		if (this.like == null) {
			return "";
		} else {
			return this.like;
		}
	}

	public String sPost() {
		if (this.post == null) {
			return "";
		} else {
			return this.post;
		}
	}

	public void printData() {
		System.out.println(this.sLike() + " " + this.sPost() + ":  " + this.name + "  " + this.greet);

	}

	public void printData2() {
		System.out.println("「Just do it!」"
				+ "Don't let your dreams be dreams」");
				//"¥nYesterday you said tomorrow"
				//"¥nSo just do it"
				 //"¥nMake your dreams come true"
				//+ "¥nJust do it!!!」");

	}

}
