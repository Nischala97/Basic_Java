import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;
public class StringComparisons {
  
   /* public static String getSmallestAndLargest(String s, int k) 
    {
        String smallest = "";
        String largest = "";
        String[] str=new String[s.length()-k];
        for(int i=0,j=0;i<s.length()-k;i++,j++)
        {
            str[j]=s.substring(i,i+k);
        }
        Arrays.sort(str);
        smallest=str[0];
        largest=str[str.length-1];
        return smallest + "\n" + largest;
    }
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //String s = scan.next();
        //int k = scan.nextInt();

	String s="welcometojava";
	int k=3;
      	System.out.println(s.length());
       // System.out.println(getSmallestAndLargest("welcometojava", 3));
	String smallest = "";
        String largest = "";
        String[] str=new String[s.length()-k+1];
        for(int i=0,j=0;i<=s.length()-k;i++,j++)
        {
            str[j]=s.substring(i,i+k);
	    System.out.println(str[j]);
        }
        Arrays.sort(str);
        smallest=str[0];
        largest=str[str.length-1];
        System.out.println(smallest + "\n" + largest);
    }
}
