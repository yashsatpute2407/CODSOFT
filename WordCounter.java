package CodSoft;
import java.util.Scanner;

	public class WordCounter 
	{
	public static void main(String[] args) 
		{
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter a sentence:");
	        String input = scanner.nextLine();

	        int wordCount = countWords(input);
	        
	        System.out.println("Number of words: " + wordCount);
	        
	        scanner.close();
	    }
	    
	    public static int countWords(String text) 
	    {
	        int wordCount = 0;
	        boolean word = false;
	        int endOfLine = text.length() - 1;

	        for (int i = 0; i < text.length(); i++) 
	        {
	           
	            if (Character.isLetter(text.charAt(i)) && i != endOfLine) 
	            {
	                word = true;
	            }
	           
	            else if (!Character.isLetter(text.charAt(i)) && word) 
	            {
	                wordCount++;
	                word = false;
	            }
	            
	            else if (Character.isLetter(text.charAt(i)) && i == endOfLine) 
	            {
	                wordCount++;
	            }
	        }
	        
	        return wordCount;
	    }

}

