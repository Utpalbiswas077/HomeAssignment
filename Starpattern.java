package OPPs;
/**
 * 
 * @author utpal java program for print star
 *
 */
public class Starpattern {
	
	public static void main(String[] args)
	{
		int i,j,k; // i for rows j for space k for star
		for(i=1;i<=9;i=i+2) // outer loop for rows
		{
		for(j=9;j>=i;j--) // inner loops for space
		{
			System.out.print(" "); // print space
			}
for(k=1;k<=i;k++) // inner loop for star
{
	System.out.print("* "); // print star
}
System.out.println(); // print next line
}
}
}
