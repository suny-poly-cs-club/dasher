package dash;

import java.util.Scanner;

public class Dasher {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter some words: ");
		String words = input.nextLine();
		
		System.out.println(dashMe(words));
	}
	
	public static String dashMe(String input)
	{
		String outPut = "";
		for(int i = 0; i < input.length(); i++)
		{
			char letter = input.charAt(i);
			
			switch(letter)
			{
				case('a'):
				case('A'):
				{
					String dashedLet = "-"+letter+'-';
					outPut+=dashedLet;
				}break;
				
				case('i'):
				case('I'):
				{
					String dashedLet = "-"+letter+'-';
					outPut+=dashedLet;
				}break;
				
				case('e'):
				case('E'):
				{
					String dashedLet = "-"+letter+'-';
					outPut+=dashedLet;
				}break;
				
				case('o'):
				case('O'):
				{
					String dashedLet = "-"+letter+'-';
					outPut+=dashedLet;
				}break;
				
				case('u'):
				case('U'):
				{
					String dashedLet = "-"+letter+'-';
					outPut+=dashedLet;
				}break;
				
				default:
				{
					outPut+=letter;
				}break;
			}
		
		}
		return outPut;
	}

}
