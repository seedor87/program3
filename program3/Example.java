package program3;

/**
 * Created by Bill & Bob on 2/16/2016.
 */
public class Example
{
    static String alphabet = "abcdefghijklmnopqrstuvwxyz";
    static String alternate = "zabcdefghijklmnopqrstuvwxy";

    public static void main(String[] args)
    {
        String in = "helloworld";
        String out = "";

        for(int i = 0; i < in.length(); i++)
        {
            int x = alphabet.indexOf(in.charAt(i));
            out += alternate.charAt(x);
        }
        System.out.println(out);

    }
}

/** This example in our version of minijava
 public class Example
 {
 static alphabet = "abcdefghijklmnopqrstuvwxyz";
 static alternate = "zabcdefghijklmnopqrstuvwxy";

 public static void main(String[] args)
 {
 in = "helloworld";
 out = "";

 for(i = 0; i < in.length(); i++)
 {
 x = alphabet.indexOf(in.charAt(i));
 out += alternate.charAt(x);
 }
 System.out.println(out);

 }
 }
 */

/**
 * Our minijava's primary goal is to hide away the typing inherit in java.
 * This a way to reduce down the code, making it mini, and also it provides a
 * good challenge for our project, given java is a strongly typed language.
 * Many of our tokens will carry over from java, class, for, if, etc. The
 * big difference will be in declarations and when variables are accessed.
 * Assignment statements and statements that get or set the data contained
 * in a variable will be processed differently.
 *
 * Keywords: static, class, public, for, void...
 * Variables: masked into simply being referenced by name.
 * Special characters: {},(), ;
 * Operators: +,=, +=, <, ++...
 * Comments: //
 * Whitespace is ignored.
 * */