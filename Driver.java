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
 * @author Robert Seedorf, Bill Clark
 *
 */
public class Driver {

	public static void main(String[] args) {
		
		Lexer l = new Lexer();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to lexically analyzed:");
		String input = sc.nextLine();
        if(input.length() < 1) {
            System.out.println("Usage: java Lexer \"((some Scheme) (code to) lex)\".");
            return;
        }
        List<Token> tokens = l.lex(input);
        for(Token t : tokens) {
            System.out.println(t);
        }
    }
}
