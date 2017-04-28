/*
 * This is a sample comment, what I am typing is ignored by Java. 
 * Let's see if the code will be moved to the next line. Oh... it will not.
 * Also it seems to be necessary tu put stars on your own, as NetBeans will not
 * do that automatically for you. There seems also to be no shortcut to mark 
 * a block of text / code as a ceomment. Oh, there is. Ctrl - /. But it does //
 */
package helloworld;

import java.util.Scanner;

/**
 *
 * @author Michal Cieslicki
 */
public class HelloWorldMike {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String yourName = input.nextLine();
        System.out.printf("Hello, %s!!!\n", yourName); 
    }
} // end of class HelloWorldMike
