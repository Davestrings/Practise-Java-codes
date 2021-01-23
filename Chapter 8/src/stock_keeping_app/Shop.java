package stock_keeping_app;

public class Shop {
	private String Address;
	private String name;
	private String daysOpened;
	private int openingHours;
	private int closingHours;
	private Invoice shopInvoice;
	private Attendant myAttendant;
	private Stock_Item stockItem;
	
	public Shop(String address, String name, String day, int openingHours, int closingHours, Attendant myAttendant) {
		super();
		Address = address;
		this.name = name;
		if(openingHours < 8 || day.toLowerCase().equals("sunday")) {
			throw new IllegalArgumentException("Shop does not open until 8 GMT monday through saturday.");
		}
		this.openingHours = openingHours;
		
		if(closingHours < 17 || day.toLowerCase().equals("sunday")) {
			throw new IllegalArgumentException("closing hours is 17 GMT.");
		}
		this.closingHours = closingHours;
		this.myAttendant = myAttendant;
	}

	public int getClosingHours() {
		String day = getDay(daysOpened);
		if(closingHours < 17 || day.toLowerCase().equals("sunday")) {
			throw new IllegalArgumentException("closing hours is 17 GMT.");
		}
		return closingHours;
	}
	public int getOpeningHours() {
		String day = getDay(daysOpened);
		if(openingHours < 8 || day.toLowerCase().equals("sunday")) {
			throw new IllegalArgumentException("Shop does not open until 8 GMT monday through saturday.");
		}
		return openingHours;
	}
	public String getDay(String day) {
		daysOpened = day;
		return daysOpened;
	}
	public String getShopName(String shopName) {
		name = shopName;
		return name;
	}
	public void setAddress(String Address) {
		this.Address = Address;
	}
	public String getAddress() {
		return Address;
	}
	
	public Invoice getShopInvoice() {
		return shopInvoice;
	}

	public void setShopInvoice(Invoice shopInvoice) {
		this.shopInvoice = shopInvoice;
	}

	public Attendant getMyAttendant() {
		return myAttendant;
	}

	public void setMyAttendant(Attendant myAttendant) {
		this.myAttendant = myAttendant;
	}

	public Stock_Item getStockItem() {
		return stockItem;
	}

	public void setStockItem(Stock_Item stockItem) {
		this.stockItem = stockItem;
	}
}
