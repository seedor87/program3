package program3;

import java.util.List;
import java.util.Scanner;
/**
 * This code has been adapted from a source on the Internet to be described, Found at:
 * http://stackoverflow.com/questions/17848207/making-a-lexical-analyzer
 * 
 * This code has been re-fashioned from a generous open source publication, we have learned it its intricacies, 
 * and we have implemented it for our submission in this project
 * 
 * This class is the driver; the main method that executes the functionality of our program
 * 
 * @author Robert Seedorf, Bill Clark
 *
 */
public class Driver {

	public static void main(String[] args) {
		
		LexicalAnalyzer lex = new LexicalAnalyzer();
		boolean quit = false;
		Scanner sc = new Scanner(System.in);
		while(!quit) {
			System.out.println("\nEnter the string to be lexically analyzed: (enter a blank String to quit)");
			String input = sc.nextLine();
	        if(input.equals("")) {
	            System.out.println("Thank You");
	            return;
	        }
	        List<Token> tokens = lex.analyze(input);
	        for(Token t : tokens) {
	            System.out.println(t);
	        }
		}
		
    }
}
