package solid;



/**
 * 
 * Principle one states that a class should have one reason to change 
 * i.e., a class should hold only one responsibility 
 * 
 * The Invoice class has 4 responsibilities i.e., calculation,printing, save
 *  to db, save to file
 *  which makes it to neglect solid principle 1
 */
class Marker1{

	String name;
	String color;
	int year;
	int price;

	public Marker1(String name, String color, int year, int price) {
		super();
		this.name = name;
		this.color = color;
		this.year = year;
		this.price = price;
	}

}

class Invoice {
	private Marker1 marker;
	private int quantity;

	public Invoice(Marker1 marker, int quantity) {
		super();
		this.marker = marker;
		this.quantity = quantity;
	}

	public void printInvoice() {
		System.out.println("Invoice printing...");
	}
	public int calculatePrice() {
		return quantity * marker.price;
	}

	public void saveToDB() {

	}

	

}