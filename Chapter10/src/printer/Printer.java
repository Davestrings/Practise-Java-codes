package printer;

public class Printer {
	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;
	
	public Printer(int tonerLevel, boolean duplex) {
			if(tonerLevel >=1 && tonerLevel <=100) {
				this.tonerLevel = tonerLevel;
			}else {
				this.tonerLevel = -1;
			}
		
		this.duplex = duplex;
		this.pagesPrinted = 0;
	}
	
	public int getTonerLevel() {
		return tonerLevel;
	}
	public void addToner(int toner) {
		if(tonerLevel == 0 && toner <= 100) {
			tonerLevel = toner;
		}else if(tonerLevel > 1) {
			int difference = 100 - tonerLevel;
			if(difference > toner && difference > 0) {
				tonerLevel += toner;
			}else if(difference < toner) {
				int excess = toner - difference;
				toner += excess;
				tonerLevel += toner;
			}
		}
	}
	public boolean isDuplex(boolean dup) {
		if(dup) {
			duplex = true;
			return duplex;
		}
		return duplex = false;
		
	}
	public boolean isPrinterOn(boolean on) {
		if(on) {
			System.out.println("Printer is On");
			return on;
		}
		System.out.println("Printer is off");
		return on;
		
	}
	public int printPages(int pages) {
		int pagesToPrint = pages;
		if(isDuplex(true) && isPrinterOn(true)) {
			pagesToPrint /= 2 + pagesToPrint % 2;
			System.out.println("Printing in duplex mode");
			return this.pagesPrinted = pagesToPrint;
		}else if(isPrinterOn(false)){
			System.out.println("Printer is off");
			return pagesPrinted = 0;
		}
		this.pagesPrinted = pagesToPrint;
		return pagesPrinted;
	}
	
}
