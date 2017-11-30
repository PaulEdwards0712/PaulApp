package app1;
import java.util.Scanner;
public class Multi2{


	public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    System.out.println("Enter a Number");
    int c = num.nextInt();
	    for (int b=1; b<12; b++) {
				System.out.println(c*b);	
	}
}
}