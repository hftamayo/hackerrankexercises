package sv.com.htamayo.java.challenge30daysept;
/*
https://www.hackerrank.com/challenges/30-binary-trees/problem?isFullScreen=true
referencia: https://www.interviewbit.com/blog/level-order-traversal/
no entendi con certeza como se ordena por niveles los nodos, ya vienen asi cuando se esta llenando el BST?
 */

import java.util.*;
import java.io.*;

public class Day23LoBst {

    class Node{
        Node left,right;
        int data;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    class Solution{

        static void levelOrder(Node root){
            //Write your code here

            int h = height(root);
            int i;
            for (i=1; i<=h; i++)
                CurrentLevel(root, i);
        }

        static int height(Node root) {
            if (root == null)
                return 0;
            else {
                int lheight = height(root.left);
                int rheight = height(root.right);
                if (lheight > rheight)
                    return(lheight+1);
                else return(rheight+1);
            }
        }
        static void CurrentLevel (Node root ,int level) {
            if (root == null)
                return;
            if (level == 1)
                System.out.print(root.data + " ");
            else if (level > 1) {
                CurrentLevel(root.left, level-1);
                CurrentLevel(root.right, level-1);
            }
        }


        public static Node insert(Node root,int data){
            if(root==null){
                return new Node(data);
            }
            else{
                Node cur;
                if(data<=root.data){
                    cur=insert(root.left,data);
                    root.left=cur;
                }
                else{
                    cur=insert(root.right,data);
                    root.right=cur;
                }
                return root;
            }
        }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }
    }


}
