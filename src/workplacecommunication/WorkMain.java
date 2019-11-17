package workplacecommunication;












class ent {
	
}





public class WorkMain {
	public static void main(String[] args) {

		   Person person1 = new Person(true, "部下", "鈴木", "おはようございます");
		    person1.printData();

		    Person person2 = new Person(false, "部下", "佐藤", "おはようございます");
		    person2.printData();

		    Person person3 = new Person(true, "同期", "伊藤", "おはよう");
		    person3.printData();

		    Person person4 = new Person(false, "同期", "藤田", "おはよう");
		    person4.printData();

		    Person person5 = new Person(true, "上司", "田中", "おはよう");
		    person5.printData();

		    Person person6 = new Person(false, "上司", "斉藤", "おはよう");
		    person6.printData();

		    Person person7 = new Person(true, "社長", "斉藤", "おはよう");
		    person7.printData();

		    Person person8 = new Person("メリーさん", "今、あなたの後ろにいるの");
		    person8.printData();

		    Person person9 = new Person("未来の自分", "よう");
		    person9.printData();




	}






}


