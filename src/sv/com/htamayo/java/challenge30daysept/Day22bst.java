package sv.com.htamayo.java.challenge30daysept;

/*
recursos que me ayudaron a entender los Nodes
https://examples.javacodegeeks.com/java-node-example/

*/


public class Day22bst {
    public static int getHeight(Node root){
        if(root == null){
            return -1;
        }
        else{
            return Math.max(getHeight(root.left), getHeight(root.right))+1;

        }
    }
}
