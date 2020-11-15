package bst.traversal;

import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {


        BinarySearchTree tree = new BinarySearchTree();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int numOfBlocks = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split(" ");

        for(int i=0;i<numOfBlocks;i++)
        {
            tree.insert(Integer.parseInt(nums[i]));
        }
        br.close();


        tree.preder();
        tree.inorder();
        tree.postder();

    }
}

class BinarySearchTree {
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    class Node
    {
        int key;
        Node left, right;

        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }
    Node root;

    BinarySearchTree()
    {
        root = null;
    }
    void insert(int key)
    {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key)
    {

        if (root == null)
        {
            root = new Node(key);
            return root;
        }

        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    void inorder() throws IOException {
        inorderRec(root);
        bufferedWriter.write("\n");

    }

    void preder() throws IOException {
        prederRec(root);
        bufferedWriter.write("\n");

    }

    void postder() throws IOException {
        postderRec(root);
        bufferedWriter.close();
    }

    void inorderRec(Node root) throws IOException {
        if (root != null) {
            inorderRec(root.left);
            bufferedWriter.write(root.key + " ");
            inorderRec(root.right);
        }
    }

    void prederRec(Node root) throws IOException {
        if (root != null) {
            bufferedWriter.write(root.key + " ");
            prederRec(root.left);
            prederRec(root.right);
        }
    }

    void postderRec(Node root) throws IOException {
        if (root != null) {
            postderRec(root.left);
            postderRec(root.right);
            bufferedWriter.write(root.key + " ");
        }
    }
}


