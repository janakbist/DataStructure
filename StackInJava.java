package hamropatro.datastructure;

import java.io.*;
import java.util.*;
public class StackInJava {
    public static void main(String[] args) {
        Stack stack1 =  new Stack();
        Stack<String> stack2 = new Stack();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.pop();
        stack2.push("apple");
        stack2.push("banana");
        stack2.push("Tomata");
        
        System.out.println(stack1);
        System.out.println(stack2);
        stack1.pop();
    }
    
}
