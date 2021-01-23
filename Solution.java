import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        //int order = 0;
        int sum = 0 ;
        int save;
        while(true){
            int order = count + 1;
            System.out.printf("Enter a number #%d: ",order);
            boolean isAnInt = in.hasNextInt();
            if(isAnInt){
                save = in.nextInt();
                sum +=save;
                ++count;
                if(count == 10){
                    break;
                }
            }else{
                System.out.println("Invalid Number");
            }
            in.nextLine();
        }
        System.out.printf("Sum of %d numbers is %d: ",count, sum);
        in.close();
    }
}