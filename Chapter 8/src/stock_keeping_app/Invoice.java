package stock_keeping_app;


public class Invoice {
	private String costomerName;
	private double price;
	private int quantityOfItemBought;
	private ItemCategory stockItemCategory;
	
	public Invoice(String name, ItemCategory item, int quantity ) {
		costomerName = name;
		this.stockItemCategory = item;
		this.quantityOfItemBought = quantity;
		price = item.getPricePerItem();
	}

	public Invoice(ItemCategory stock) {
			price = stock.getPricePerItem();
	}
	
	public Invoice() {
	}
	public void setPriceOfItem(ItemCategory item) {
			price = item.getPricePerItem();
	}
	public double getPriceOfItem() {
		return price;
	}

	public void setName(String name) {
		costomerName = name;
	}
	public String getName() {
		return costomerName;
	}
	public void setQuantityOfItemBought(int quantity) {
		quantityOfItemBought = quantity;
	}

	public int getQuantityOfItemBought() {
		return quantityOfItemBought;
	}
	public void setStockItemCategory(ItemCategory item) {
		stockItemCategory = item;
	}
	public ItemCategory getStockItemCategory() {
		return stockItemCategory;
	}
	public void displayItemList() {
		stockItemCategory.itemList();
	}

}

