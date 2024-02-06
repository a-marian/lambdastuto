package ar.com.lambdastuto.exercises;

import java.util.*;
import java.io.*;


  class BinaryHeightTree {

      public static int height(Node root) {
          if(root == null) {
              return -1;
          } else {
              return Math.max(height(root.left), height(root.right)) +1;
          }

      }

 /* Node is defined as :
 class Node
    int data;
    Node left;
    Node right;

    */


        public static Node insert(Node root,int data) {

            if(root == null){
                return new Node(data);
            } else {
                Node actual;
                if (data <= root.data){
                    actual =  insert(root.left, data);
                    root.left = actual;
                } else {
                    actual =  insert(root.right, data);
                    root.right = actual;
                }
                return root;
            }

        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int t = scan.nextInt();
            Node root = null;
            while(t-- > 0) {
                int data = scan.nextInt();
                root = insert(root, data);
            }
            scan.close();
            int height = height(root);
            System.out.println(height);
        }
    }
