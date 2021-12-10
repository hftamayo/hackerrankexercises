package sv.com.htamayo.java.challenge30daysept;
/*
link: https://www.hackerrank.com/challenges/30-queues-stacks/problem?isFullScreen=true
score: 30 of 30
*/

import java.io.*;
import java.util.*;

public class Day19 {
    public class Solution {
        // Write your code here.
        //I shouldn't user char because data types are not used as parameters
        Stack<Character> myStack;
        Queue<Character> myQueue;

        public Solution(){
            myStack = new Stack<Character>();
            myQueue = new LinkedList<>();
        }

        void pushCharacter(Character ch){
            char stackChar = ch;
            myStack.push(stackChar);
        }

        void enqueueCharacter(Character ch){
            char queueChar = ch;
            myQueue.add(ch);
        }

        char popCharacter(){
            return (char) myStack.peek();
        }

        char dequeueCharacter(){
            return (char) myQueue.peek();
        }


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            scan.close();

            // Convert input String to an array of characters:
            char[] s = input.toCharArray();

            // Create a Solution object:
            Solution p = new Solution();

            // Enqueue/Push all chars to their respective data structures:
            for (char c : s) {
                p.pushCharacter(c);
                p.enqueueCharacter(c);
            }

            // Pop/Dequeue the chars at the head of both data structures and compare them:
            boolean isPalindrome = true;
            for (int i = 0; i < s.length/2; i++) {
                if (p.popCharacter() != p.dequeueCharacter()) {
                    isPalindrome = false;
                    break;
                }
            }

            //Finally, print whether string s is palindrome or not.
            System.out.println( "The word, " + input + ", is "
                    + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
        }
    }

}
