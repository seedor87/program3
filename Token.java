package program3;

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
	
	public final Type t;		// category of token, useful in conversion to executable form
    public final String c; 		// literal value of token
    
    public Token(Type t, String c) {
        this.t = t;
        this.c = c;
    }
    
    public String toString() {
        if(t == Type.ATOM) {
            return "ATOM<" + c + ">";
        }
        if(t == Type.OPERATOR) {
        	return "OPERATOR<" + c + ">";
        }
        return t.toString();
    }
}
	        
