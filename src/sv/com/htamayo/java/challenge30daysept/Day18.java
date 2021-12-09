package sv.com.htamayo.java.challenge30daysept;

public class Day18 {
    public class Solution {
        // Write your code here.
        Stack<char> myStack;
        Queue<Integer> myQueue;

        public Solution(){
            myStack = new Stack<char>();
            myQueue = new LinkedList<>();
        }

        void pushCharacter(char ch){
            char stackChar = ch;
            myStack.push(stackChar);
        }

        char popCharacter(){
            return (char) myStack.pop();
        }

        void enqueueCharacter(char ch){
            char queueChar = ch;
            q.add(ch);
        }

    }
