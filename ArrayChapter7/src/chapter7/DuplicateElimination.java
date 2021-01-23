package chapter7;
import java.util.ArrayList;
import java.util.Scanner;
public class DuplicateElimination {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in); //object of scanner
	        ArrayList<Integer> mylist = new ArrayList<Integer>(); //create array list 
	        
	        for(int count = 1; count <=5; count++){
	            System.out.println("Enter number: ");
	            int number = scan.nextInt();
	            theMethod(number, mylist);
	        }
	        System.out.println(mylist);
	        scan.close();
	}

	 public static void theMethod(int number, ArrayList<Integer> myArray){
         if(!myArray.contains(number)){
             myArray.add(number);
             System.out.println(myArray);

         }
	 }
}
