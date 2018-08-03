/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package helloworldapp;

/**
 * The HelloWorldApp class implements an application that
 * simply prints "Hello World!" to standard output.
 */
public class HelloWorldApp {

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int index;


        System.out.println("Hello World!"); // Display the string.
        
        if (args.length != 0)
        {
        for (index = 0; index < args.length; ++index)
        {
            System.out.println("args[" + index + "]: " + args[index]);
        }

        }
    }

}
