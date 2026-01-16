package View;

import Controller.BookController;
import Model.Book;

import java.util.Scanner;
public class BookView {
	BookController b1;
	
	public BookView(BookController b1) {
		this.b1=b1;
	}
	public void showchoice() {
		int choice=0;
		Scanner sc=new Scanner(System.in);
	do {
		System.out.println("===== Book Management System =====");
		System.out.println("1. Add Book");
		System.out.println("2. Remove Book");
		System.out.println("3. Search Book by ID");
		System.out.println("4. Search Book by Name");
		System.out.println("5. Show All Books by Author");
		System.out.println("6. Show All Books by Category");
		System.out.println("7. Update Book Price/Rating");
		System.out.println("8. Display Sorted Books");
		System.out.println("9. Display Top 3 Books");
		System.out.println("10. Display All Books");
		System.out.println("11. Exit");
		System.out.println();
		System.out.print("Enter Choice (11 to Exit):- ");
		choice=sc.nextInt();
		
		switch(choice) {
		
		case 1:System.out.print("Enter Book Id:- ");
				int bid=sc.nextInt();
				System.out.print("Enter Book Name:- ");
				sc.nextLine(); 
				String bName = sc.nextLine();

				System.out.print("Enter Author Name:- ");
				String aName = sc.nextLine();

				System.out.print("Enter Category:- ");
				String category = sc.nextLine();

				System.out.print("Enter Book Price:- ");
				double price = sc.nextDouble();

				System.out.print("Enter Book Rating:- ");
				double rating = sc.nextDouble();
				
				b1.addBook(new Book(bid,bName,aName,category,price,rating));
				break;
				
		case 2:
			System.out.print("Enter Book ID to remove book:- ");
			int id=sc.nextInt();
			b1.removeBook(id);
			break;
			
		case 3:System.out.print("Enter Id of Book To search:-");
				int sid=sc.nextInt();
				b1.searchBook(sid);
				break;
				
		case 4:
			System.out.print("Enter Book Name To Search:- ");
			sc.nextLine();
			String name=sc.nextLine();
			b1.searchbnm(name);
			break;
			
		case 5:
			System.out.print("Enter Author name to search Book:- ");
			sc.nextLine();
			String aname=sc.nextLine();
			b1.showabauthor(aname);
			break;
		case 6:
			System.out.print("Enter Category  to search Book:-");
			sc.nextLine();
			String cname=sc.nextLine();
			b1.showabcategory(cname);
			break;
			
		case 7:
			int select=0;
			while(select!=3) {
				System.out.print("enter 1 to update price or 2 to update Rating(3 to exit):- ");
				select=sc.nextInt();
				if(select==1) {
					System.out.print("Enter Book id:-" );
					int bookid=sc.nextInt();
					System.out.print("Enter price to update this book:- ");
					double uprice=sc.nextDouble();
					b1.updateprice(bookid,uprice);
				}else if(select==2) {
					System.out.print("Enter Book id:-" );
					int bookid=sc.nextInt();
					System.out.print("\nEnter updated rating for this book:- ");
					double urating=sc.nextDouble();
					b1.updaterating(bookid, urating);
				}
			}
			break;
			
		case 8:
			int sel=0;
			while(sel!=3) {
				System.out.print("Enter 1 for sort by price or 2 for rating(3 for exit):- ");
				sel=sc.nextInt();
				if(sel==1) {
					b1.sortprice();
				}else if(sel==2) {
					b1.sortrating();
				}
			}
			break;
			
		case 9:
			int cho=0;
			while(cho!=3) {
				System.out.print("Enter 1 for Top 3 by price or 2 for Top 3 rating(3 for exit):- ");
				cho=sc.nextInt();
				if(cho==1) {
					b1.topthreeprice();
				}else if(cho==2) {
					b1.topthreerating();
				}
			}
			break;
			
		case 10:
			b1.display();
			break;
		}
	}while(choice!=11);
}
}

