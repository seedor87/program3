package program3;

import program3.Lexer.Type;

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
public class Token {
	public final Type t;
    public final String c; // contents mainly for atom tokens
    // could have column and line number fields too, for reporting errors later
    public Token(Type t, String c) {
        this.t = t;
        this.c = c;
    }
    public String toString() {
        if(t == Type.ATOM) {
            return "ATOM<" + c + ">";
        }
        return t.toString();
    }
}
	        
