package program3;

import java.util.List;
import java.util.ArrayList;

/**
 * This code has been adapted from a source on the Internet to be described, Found at:
 * http://stackoverflow.com/questions/17848207/making-a-lexical-analyzer
 * 
 * This code has been re-fashioned from a generous open source publication, we have learned it its intricacies, 
 * and we have implemented it for our submission for this project
 * 
 * @author Robert Seedorf, Bill Clark
 *
 */
public class Lexer {
	
    public static enum Type {
        /*
         * java like sub-language using in-fix operation of arithmetic (uses +, -, *, /, %)
         */
        LPAREN, RPAREN, OPERATOR, ATOM;
    }

    /*
     * Given a String, and an index, get the atom starting at that index
     */
    public static String getAtom(String s, int i) {
        int j = i;
        while(j < s.length()) {
            if(Character.isLetter(s.charAt(j))) {
                j++;
            } else {
                return s.substring(i, j);
            }
        }
        return s.substring(i, j);
    }

    public List<Token> lex(String input) {
        List<Token> result = new ArrayList<Token>();
        for(int i = 0; i < input.length(); ) {
            switch(input.charAt(i)) {
            case '(':
                result.add(new Token(Type.LPAREN, "("));
                i++;
                break;
            case ')':
                result.add(new Token(Type.RPAREN, ")"));
                i++;
                break;
            case '+':
            	result.add(new Token(Type.OPERATOR, "+"));
            	i++;
            	break;
            case '-':
            	result.add(new Token(Type.OPERATOR, "-"));
            	i++;
            	break;
            case '*':
            	result.add(new Token(Type.OPERATOR, "*"));
            	i++;
            	break;
            case '/':
            	result.add(new Token(Type.OPERATOR, "/"));
            	i++;
            	break;
            case '%':
            	result.add(new Token(Type.OPERATOR, "%"));
            	i++;
            	break;
            default:
                if(Character.isWhitespace(input.charAt(i))) {
                    i++;
                } else {
                    String atom = getAtom(input, i);
                    i += atom.length();
                    result.add(new Token(Type.ATOM, atom));
                }
                break;
            }
        }
        return result;
    }
}