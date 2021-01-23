public class Invoice{
	private int invoiceNumber;
	private String description;
	private double priceDue;
	private String name;
	private String billingAddress;

	public void setInvoiceNumber(int invoiceNumber){
		this.invoiceNumber = invoiceNumber;
	}

	public int getInvoiceNumber(){
		return invoiceNumber;
	}
}