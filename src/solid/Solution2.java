package solid;

interface InvoiceDao3 {

	/*
	 * this solves the problem of 
	 */
	public void save();
	
}
class DatabaseInvoiceDao implements InvoiceDao3 {

	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}
	
}
class FileInvoiceDao implements InvoiceDao3 {
	
	public void save() {
		
	}
}