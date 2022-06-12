package OPPs;

import java.util.Scanner;

public class LastOrFirstDigit {
	public static void main(String[] args)
	{
int number, last_digit=0, first_digit=0; // DECLEARTION THE VARAIBLE

System.out.println(" Enter any number: ");
Scanner sc=new Scanner(System.in);// CREAT A SCANNER CLASS 
number=sc.nextInt(); // INPUT FROM USER

//for finding last digit 
last_digit=number%10;    //123%10=3 REMENDER 
System.out.println("The last digit of enter number is: "+last_digit); // PRINT LAST DIGIT
// to finding first digit
while(number!=0)
{
	first_digit=number%10; // 123%10=3 REMENDER NOW 3 AND NUMBER IS 12 
	number=number/10;      // 12/10=1 NUMBER IS 1 NOW 
}
System.out.println("The first digit of enter number is: "+first_digit);	// PRINT FIRST DIGIT		

}
}