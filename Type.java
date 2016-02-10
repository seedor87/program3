package program3;

/**
 * This class is the enumeration of useful reserve symbols to be used in further lexical analysis of the line being processed
 * Included is a key to illustrate the meanings of the keywords in relation to the language
 * 
 * @author Robert Seedorf
 *
 */
public enum Type {
    /*
     * Key:
     * 
     * LPAREN - 		(
     * RPAREN - 		)
     * LCURL -			{
     * RCURL -			}
     * OPERATOR - 		+ - * / % ^
     * ASSIGNEMENT - 	=
     * SQUOTE - 		'
     * DQUOTE - 		"
     * COMMENT -		#
     * SEMICOLON -		;
     * ATOM -			a-z | A-Z | 0-9
     * 
     */
    LPAREN, RPAREN, OPERATOR, ATOM, ASSIGNMENT, SQUOTE, DQUOTE, COMMENT, SEMICOLON, LCURL, RCURL;
}
