package program3;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * This code has been adapted from a source on the Internet to be described, Found at:
 * http://stackoverflow.com/questions/17848207/making-a-lexical-analyzer
 * 
 * This code has been re-fashioned from a generous open source publication, we have learned it its intricacies, 
 * and we have implemented it for our submission for this project
 * 
 * This class is the analyzation tool that programmatically parses, separates, tokenizes and returns in String format Tokens of the line of text being analyzed
 * 
 * @author Robert Seedorf, Bill Clark
 *
 */
public class LexicalAnalyzer {
	
	private ArrayList<String> reserveSymbols = new ArrayList<String>(); 
	
	public LexicalAnalyzer() {
		reserveSymbols = new ArrayList<String>(Arrays.asList("(", ")", "{", "}", "+", "-", "*", "/", "%", "=", "\"", "'", "#", ";"));
	}

   /**
    * returns String of token value for printing
    * @param s
    * @param i
    * @return
    */
    public static String getTokenString(String s, int i) {
        int j = i;
        while(j < s.length()) {
            if(Character.isLetter(s.charAt(j)) || Character.isDigit(s.charAt(j)) || s.charAt(j) == '.') {
                j++;
            } else {
                return s.substring(i, j);
            }
        }
        return s.substring(i, j);
    }
    /**
     * This method takes a string, that is a substring of the whole test input and analyzes it to be categorized as some particular token
     * @param input - substring of line to be read
     * @return - token representing categorization of substring
     */
    public static Token getToken(String input) {
    	for(int i = 0; i < input.length(); ) {
            switch(input.charAt(i)) {
            case '(':
                return new Token(Type.LPAREN, "(");
            case ')':
                return new Token(Type.RPAREN, ")");
            case '{':
            	return new Token(Type.LCURL, "{");
            case '}':
            	return new Token(Type.RCURL, "}");
            case '+':
            	return new Token(Type.OPERATOR, "+");
            case '-':
            	return new Token(Type.OPERATOR, "-");
            case '*':
            	return new Token(Type.OPERATOR, "*");
            case '/':
            	return new Token(Type.OPERATOR, "/");
            case '%':
            	return new Token(Type.OPERATOR, "%");
            case '^':
            	return new Token(Type.OPERATOR, "^");
            case '=':
            	return new Token(Type.ASSIGNMENT, "=");
            case '\'':
            	return new Token(Type.SQUOTE, "'");
            case '"':
            	return new Token(Type.DQUOTE, "\"");
            case '#':
            	return new Token(Type.COMMENT, "#");
            case ';':
            	return new Token(Type.SEMICOLON, ";");
            default:
                if(!Character.isWhitespace(input.charAt(i))) {
                    String atom = getTokenString(input, i);
                    i += atom.length();
                    return new Token(Type.ATOM, atom);
                }
                break;
            }
    	}
        return null;
    }

    /**
     * This method processes the total input String to clarify elements whose tokenization will be precluded by illegal characters, keywords, etc. 
     * @param s - Total string to be pre-processed
     * @return String with necessary pre-processing enacted upon it.
     */
    public String preprocess(String s) {
    	for(String str: reserveSymbols) {
    		s = s.replace(str, " " + str + " ");
    	}
    	s = s.replaceAll("\\s+", " ");
    	s = s.trim();
    	return s;
    }
    
    /**
     * this method programmatically parses the entire input string and tokenizes each element with a call to getToken().
     * @param input - total input String
     * @return - List of tokens of elements of input
     */
    public List<Token> analyze(String input) {
    	input = preprocess(input);
        String[] split = input.split(" ");
        List<Token> result = new ArrayList<Token>();
        for(String s: split) {
        	result.add(getToken(s));
        }
        return result;
    }
}