package stock_keeping_app;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Stock_Item {
	private Logger logger = Logger.getLogger(Stock_Item.class.getName());
	
	private String itemId;
	private String batchNumber;
	private ItemCategory stock;
	private int totalStock;
	
	public Stock_Item(String itemId, String batchNumber, ItemCategory myStock, int totalStock) {
		this.itemId = itemId;
		this.batchNumber = batchNumber;
		stock = myStock;
		this.totalStock = totalStock;
	}

	public Stock_Item() {
		
	}

	public void setItemId(String itemId ) {
		this.itemId = itemId;
	}
	public String getItemId() {
		return itemId;
	}
	
	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}
	
	public String getBatchNumber() {
		return batchNumber;
	}
	
	public ItemCategory getStock() {
		return stock;
	}
	public void setStockItem(ItemCategory item) {
		stock = item;
	}
	
	public void displayAllBrands() {
		stock.itemBrand();
	}
	
	public String getItemBrand(ItemCategory item) {
		return item.getBrand();
	}
	
	public void displayItemList() {
		stock.itemList();
	}
	
	public int calculateTotalStock(ItemCategory item) {
		ArrayList<ItemCategory> itemArray = new ArrayList();
		
		for(ItemCategory mystock : item.values()) {
			logger.info(mystock.toString());
			System.out.println(mystock.getQuantity());
			itemArray.add(mystock);
		}
		
		for(int count = 0; count < itemArray.size(); count++){
			totalStock += item.getQuantity();
		}
		System.out.println(totalStock);
		return totalStock;
	}
	
	public double getPriceOfEachItem() {
		return stock.getPricePerItem();
	}
} 
