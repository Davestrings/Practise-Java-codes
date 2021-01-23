//7.10 (Sales Commissions) Use a one-dimensional array to solve the following problem: A company pays its salespeople on a commission basis. The salespeople receive $200 per week plus 9% of
//their gross sales for that week. For example, a salesperson who grosses $5,000 in sales in a week receives $200 plus 9% of $5,000, or a total of $650. Write an application (using an array of counters)
//that determines how many of the salespeople earned salaries in each of the following ranges (assume
//that each salesperson’s salary is truncated to an integer amount):
//a) $200–299
//b) $300–399
//c) $400–499
//d) $500–599
//e) $600–699
//f) $700–799
//g) $800–899
//h) $900–999
//i) $1,000 and over
//Summarize the results in tabular format.

package chapter7;

public class SaleCommission {
	private static int[] grossSale = {2000, 3000, 5000, 6000, 3000, 5000, 7000, 5000, 1000, 6000, 8000, 7000, 6000, 1000, 7500, 5500};
	private int[] salaryFrequency = new int[11];
	private final int SALARY = 200;
	private int commission = 9;
	
	public static void main(String[] args) {
		SaleCommission obj = new SaleCommission();
		obj.setgrossSale(grossSale);
		obj.displaygrossSale();
		System.out.printf("%10s%20s%n", "Salary Range", "Number of Employee");
		
		for(int count = 0; count< obj.salaryFrequency.length; count++) {
			System.out.printf("%-5d-%6d: %15d%n", count*100, ( count*100 == 1000 ? 0000 : count*100 + 99), obj.salaryFrequency[count]);
		}
		
	}
	
	public void setgrossSale(int[] grossSale) { // method calculates employee's commission and re-populates grossSale arrays with the value 
		for(int count = 0; count<grossSale.length; count++) {
			this.grossSale[count] = ((grossSale[count] * commission)/100) +SALARY;
		}
	}
	public void displaygrossSale() {
		for(int count = 0; count<grossSale.length; count++) {
			System.out.println(grossSale[count]);
		}
		for(int gross : grossSale) {
			gross = Math.round(gross/100);
			++salaryFrequency[gross];
			
		}
	}
	
//	public void setFrequency(int[] grossSale) {
//		for(int count = 1; count<grossSale.length; count++) {
//			
//		}
//	}
//	
	

}
