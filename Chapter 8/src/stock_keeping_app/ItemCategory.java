package stock_keeping_app;

public enum ItemCategory {
	//Home appliances
	TELEVISION("Sharp", 10, 86000),
	DECODER("DSTV", 20, 10900),
	MICROWAVE("Hisense", 10, 12000),
	COOKER("Hier", 10, 12000),
	IRON("LG", 15, 5000),
	COFFEE_MAKER("Hier", 20, 34000),
	REFRIDGERATOR("Hisense", 30, 79000),
	FREEZER("Hier Thermocool", 15, 75000),
	HOME_THEATRE("LG", 20, 83000),
	DVD_PLAYER("Sharp", 18, 7500),
	ELECTRIC_LAMP("Panasonic", 15, 10000),
	ELECTRIC_KETTLE("Hisense", 10, 15000),
	//office appliances
	
	PRINTER("hp", 19, 24000),
	DESKTOP("compaq", 10, 35000),
	AIR_CONDITION("Thermocool", 40, 45000),
	PERSONAL_COMPUTER("Dell", 20, 75000),
	ROUTER("LEET", 15, 1500)
	;
	
	
	private String brand;
	private int quantity;
	private double pricePerItem;
	
	private ItemCategory( String brand, int quantity, double price) {
		this.brand = brand;
		this.quantity = quantity;
		this.pricePerItem = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	public double valueOfEachItemCategory(double pricePerItem, int quantity ) {
		return pricePerItem * quantity;
	}
	
	public void itemList() {
		System.out.println("*******************************************");
		System.out.printf("%-20S%-20S%n", "Items in stock", "Available Brands");
		System.out.println("*******************************************");
		for(ItemCategory item : ItemCategory.values())
			System.out.printf("%-20s%-20s%n",item.toString(), item.getBrand());
	}
	public void itemBrand() {
		System.out.println("*******************************************");
		System.out.printf("%-20S%n","Available Brands");
		System.out.println("*******************************************");
		for(ItemCategory item : ItemCategory.values())
			System.out.printf("%-20s%n", item.getBrand());
	}
	

}
