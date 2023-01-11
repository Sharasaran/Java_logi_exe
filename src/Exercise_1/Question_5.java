
package Exercise_1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Question_5 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		String s1 = "funeral";
		String s2 ="realfun";
		
		char[]array1=s1.toCharArray();   // checek characters
		char[]array2=s2.toCharArray();
		
		Arrays.sort(array1);     // sort 
		Arrays.sort(array2);
		
		if(String.valueOf(array1).equals(String.valueOf(array2)))
	
		{
			System.out.println("string are anagram");
		}
		else
		{
			System.out.println("string  are not anagaram");
		}
	}

}
