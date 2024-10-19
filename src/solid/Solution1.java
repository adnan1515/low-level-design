package solid;



/*
 * This solves the problem by defining separate class for separate responsibility
 * 
 * 
 * */
class Marker2 {
	String name;
	String color;
	int year;
	int price;

	public Marker2(String name, String color, int year, int price) {
		super();
		this.name = name;
		this.color = color;
		this.year = year;
		this.price = price;
	}
	

}

interface InvoiceDao {
	void save();
}
class SaveToDb implements InvoiceDao {
	@Override
	public void save() {
		// This method helps to save to database
		
	}
}
class SaveToFile implements InvoiceDao {
	@Override
	public void save() {
		// This method helps to save to file
		
	}
}
class InvoicePrinter {
	Invoice invoice ;
	public InvoicePrinter(Invoice invoice) {
		this.invoice = invoice;
	}
	public void print(String text) {
		System.out.println(text);
	}
}