package Controller;

import Model.Book;

public class BookController {
	BookDAO ed=new BookDAO();
	public void addBook(Book b) {
		// TODO Auto-generated method stub
		ed.addBook(b);
	}
	public void display() {
		// TODO Auto-generated method stub
		ed.display();
	}
	public void removeBook(int id) {
		// TODO Auto-generated method stub
		ed.removeBook(id);
	}
	public void searchBook(int sid) {
		// TODO Auto-generated method stub
		ed.searchBook(sid);
	}
	public void searchbnm(String name) {
		// TODO Auto-generated method stub
		ed.searchbnm(name);
		
	}
	public void showabauthor(String aname) {
		// TODO Auto-generated method stub
		ed.showabauthor(aname);
	}
	public void showabcategory(String cname) {
		// TODO Auto-generated method stub
		ed.showabcategory(cname);
	}
	public void updateprice(int bookid, double uprice) {
		// TODO Auto-generated method stub
		ed.updateprice(bookid,uprice);
		
	}
	public void updaterating(int bookid, double urating) {
		// TODO Auto-generated method stub
		ed.updaterating(bookid,urating);
		
	}
	public void sortprice() {
		// TODO Auto-generated method stub
		ed.sortprice();
	}
	public void sortrating() {
		// TODO Auto-generated method stub
		ed.sortrating();
		
	}
	public void topthreeprice() {
		// TODO Auto-generated method stub
		ed.topthreeprice();
	}
	public void topthreerating() {
		// TODO Auto-generated method stub
		ed.topthreerating();
	}

}
