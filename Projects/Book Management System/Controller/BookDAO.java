package Controller;
import java.util.*;
import Model.Book;

public class BookDAO {

	static ArrayList <Book> bArr=new ArrayList<Book>();
	
	static{
	bArr.add(new Book(101, "Java Basics", "James", "Programming", 350.0, 4.5));
	bArr.add(new Book(102, "Python Easy", "Guido", "Programming", 300.0, 4.2));
	bArr.add(new Book(103, "C Fundamentals", "Dennis", "Programming", 250.0, 4.0));
	bArr.add(new Book(104, "Data Structures", "Mark", "Computer Science", 450.0, 4.7));
	bArr.add(new Book(105, "Operating Systems", "Silberschatz", "Computer Science", 500.0, 4.6));
	}
	public boolean addBook(Book b) {
		// TODO Auto-generated method stub
		return bArr.add(b);
	}
	public void display() {
		// TODO Auto-generated method stub
		for(Book b:bArr) {
			System.out.println(b);
		}
	}
	public void removeBook(int id) {
	    Iterator<Book> it = bArr.iterator();
	    boolean found = false;

	    while (it.hasNext()) {
	        Book b = it.next();
	        if (b.getbId() == id) {
	            it.remove();   
	            System.out.println("Book remove successful");
	            found = true;
	        }
	    }

	    if (!found) {
	        System.out.println("No book of such id");
	    }
	}

	public void searchBook(int sid) {
		// TODO Auto-generated method stub
		int found=0;
		for(Book b:bArr) {
			if(b.getbId()==sid) {
				System.out.println(b);
				found=1;
			}
		
		}
		if(found==0) {
			System.out.println("Book not found or written wrong Book id");
	}
	}
	public void searchbnm(String name) {
		// TODO Auto-generated method stub
		int found=0;
		
		for(Book b:bArr) {
			if(b.getbName().equalsIgnoreCase(name)) {
				System.out.println(b);
				found=1;
			}
		}
		if(found==0) {
			System.out.println("Book not found or written wrong Book Name");
	}
	}
	public void showabauthor(String aname) {
		// TODO Auto-generated method stub
		int found=0;
		
		for(Book b:bArr) {
			if(b.getaName().equalsIgnoreCase(aname)) {
				System.out.println(b);
				found=1;
			}
		}
		if(found==0) {
			System.out.println("Book not found or written wrong Book Author Name");
		}
	}
	public void showabcategory(String cname) {
		// TODO Auto-generated method stub
		int found=0;
		
		for(Book b:bArr) {
			if(b.getCategory().equalsIgnoreCase(cname)) {
				System.out.println(b);
				found=1;
			}
		}
		if(found==0) {
			System.out.println("Book not found or written wrong Book Category");
		}
	}
	public void updateprice(int bookid, double uprice) {
		// TODO Auto-generated method stub
		int found=0;
		for(Book b:bArr) {
			if(b.getbId()==bookid) {
				b.setPrice(uprice);
				System.out.println(b);
				found=1;
				break;
			}
		}
		if(found==0) {
			System.out.println("Book not found or written wrong Book id");
		}
		
	}
	public void updaterating(int bookid, double urating) {
		// TODO Auto-generated method stub
		int found=0;
		for(Book b:bArr) {
			if(b.getbId()==bookid) {
				b.setRating(urating);
			}
		}
	}
	public void sortprice() {
		// TODO Auto-generated method stub
		Collections.sort(bArr,new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				// TODO Auto-generated method stub
				return Double.compare(o2.getPrice(),o1.getPrice());
			}
		});
	}
	public void sortrating() {
		// TODO Auto-generated method stub
		Collections.sort(bArr,new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				// TODO Auto-generated method stub
				return Double.compare(o2.getRating(), o1.getRating());
			}
		});
	}
	public void topthreeprice() {
		// TODO Auto-generated method stub
		sortprice();
		
		for(int i=0;i<3 && i<bArr.size();i++) {
			System.out.println(bArr.get(i));
		}
	}
	public void topthreerating() {
		// TODO Auto-generated method stub
		sortrating();
		for(int i=0;i<3 && i<bArr.size();i++) {
			System.out.println(bArr.get(i));
		}
	}

}
