package solid;

class InvoiceDao2 {

	
	/*
	 * Principle 2 states that a class is open for extension and closed for modification 
	 */
	Invoice invoice;
	
	public InvoiceDao2(Invoice invoice) {
		this.invoice = invoice;
	}
	public void saveToDb() {
		
	}
	// Lets say this is the new method new to implement a feature
	// It makes a file to modify which is live and working
	public void saveToFile() {
		
	}
	
}
