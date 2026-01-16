package Model;

public class Book {
	int bId;
	String bName;
	String aName;
	String category;
	double price;
	double rating;
	
	public Book(int bId, String bName, String aName, String category, double price, double rating) {
		this.bId = bId;
		this.bName = bName;
		this.aName = aName;
		this.category = category;
		this.price = price;
		this.rating = rating;
	}
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}

	public String toString() {
		return "Book [bId=" + bId + ", bName=" + bName + ", aName=" + aName + ", category=" + category + ", price="
				+ price + ", rating=" + rating + "]";
	}
}
