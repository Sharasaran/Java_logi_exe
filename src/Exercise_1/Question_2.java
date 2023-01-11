package Exercise_1;

public class Question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reverse_word = "madam";
		for(int i=reverse_word.length()-1; i>=0; i-- )
			
		{
			//Reverse printing 
			System.out.print(reverse_word.charAt(i)); 
		}
		
		// check weather this word Palindrome or not 
		
		if (reverse_word.equals(reverse_word))
		  {	
			System.out.println("Madam is Palindrome");
	      }
		
		else 
		
		{
			System.out.println("Madam is not Palindrome");
		}

	}
	}

