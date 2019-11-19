package workplacecommunication;

public class WorkMain {

	public static void Pr(int rd) {

		switch (rd) {
		case 0:
			Person person1 = new Person("好きな", "部下", "鈴木", "「おはようございます」");
			person1.printData();
			break;

		case 1:
			Person person2 = new Person("嫌いな", "部下", "佐藤", "「おはようございます」");
			person2.printData();
			break;

		case 2:
			Person person3 = new Person("好きな", "同期", "伊藤", "「おはよう」");
			person3.printData();
			break;

		case 3:
			Person person4 = new Person("嫌いな", "同期", "藤田", "「おはよう」");
			person4.printData();
			break;

		case 4:
			Person person5 = new Person("好きな", "上司", "田中", "「おはよう」");
			person5.printData();
			break;

		case 5:
			Person person6 = new Person("嫌いな", "上司", "斉藤", "「おはよう」");
			person6.printData();
			break;

		case 6:
			Person person7 = new Person("社長", "渡辺", "「おはよう」");
			person7.printData();
			break;

		//例外処理にしたい
		case 7:
			Person person8 = new Person("例外", "メリーさん", "「今、あなたの後ろにいるの」");
			person8.printData();
			break;

		case 8:
			Person person9 = new Person("例外", "シャイア・ラブーフ", "「Do it！」");
			person9.printData();
		//person9.printData2();
			break;

		}

	}

	public static void Me(int m) {
		switch (m) {
		case 0:
			Me me0 = new Me("私", "「おはよう！」");
			me0.printData();
			break;

		case 1:
			Me me1 = new Me("私", "「おはよう」");
			me1.printData();
			break;

		case 2:
			Me me2 = new Me("私", "「おはようー」");
			me2.printData();
			break;

		case 3:
			Me me3 = new Me("私", "「おはよう」");
			me3.printData();
			break;

		case 4:
			Me me4 = new Me("私", "「おはようございます！」");
			me4.printData();
			break;

		case 5:
			Me me5 = new Me("私", "「ざっす…」");
			me5.printData();
			break;

		case 6:
			Me me6 = new Me("私", "「おはようございます！！」");
			me6.printData();
			break;

		//例外処理にしたい
		case 7:
			Me me7 = new Me("私", "「ヒエ～ッ」");
			me7.printData();
			break;

		case 8:
			Me me8 = new Me("私", "「………」");
			me8.printData();
			break;

		}

	}

	public static void main(String[] args) {
		int i = new java.util.Random().nextInt(9);
		Pr(i);
		Me(i);

	}

}
