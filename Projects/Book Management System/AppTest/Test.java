package AppTest;

import Controller.BookController;
import View.BookView;

public class Test {
	public static void main(String[] args) {
		BookController b1=new BookController();
		BookView v1=new BookView(b1);
		v1.showchoice();
	}
}
