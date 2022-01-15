package sv.com.htamayo.java.challenge30daysept;

public class Day22bst {
    public static int getHeight(Node root){
        //Write your code here
        if(root == null){
            return -1;
        }
        else{
            int valueLeft = root.left;
            int valueRight = root.right;

            if(valueLeft > valueRight){
                return (valueLeft + 1);
            }
            else{
                return (valueRight + 1);
            }
        }
    }
}
